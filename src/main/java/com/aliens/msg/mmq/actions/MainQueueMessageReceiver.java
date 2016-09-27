package com.aliens.msg.mmq.actions;

import com.aliens.msg.hazelcast.HzCacheManager;
import com.aliens.msg.hazelcast.QueueInfo;
import com.aliens.msg.hazelcast.QueueState;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.Status;
import com.google.common.base.Strings;
import com.rabbitmq.client.AMQP;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by jayant on 25/9/16.
 */
@Component
@Scope("prototype")
@Slf4j
public class MainQueueMessageReceiver extends MessageReceiver {

    @Autowired
    HzCacheManager hzCacheManager;

    final int limit=5;

    @Override
    public Status action(Message message, AMQP.BasicProperties properties) throws Exception {

        int restartState=hzCacheManager.getRestartState();

        if(restartState>0)
        {
            if(!hzCacheManager.isRestarted(threadName))
            {
                hzCacheManager.updateSet(HzCacheManager.RESTARTED_WORKER_LIST,threadName);
                hzCacheManager.decreaseRestartState();
                log.info("Restarting channel {}",threadName);
                return Status.RESTART;
            }
        }


        String groupId=message.getGroupId();

        if(Strings.isNullOrEmpty(groupId))
            return Status.FAILED;

        Optional<QueueInfo> queueInfoOptional= hzCacheManager.findByGroupId(groupId);

        if(queueInfoOptional.isPresent())
        {
            String qname=queueInfoOptional.get().getQname();
            MessageSender.sendMessage(message,qname);
            return Status.SUCCESS;
        }
        else
        {
            int size=hzCacheManager.getSize();
            if(size<limit)
            {

                if(hzCacheManager.isWaiting(groupId))
                {
                    //log.info("Initalize channel restart");
                    //hzCacheManager.handleRestart();
                    return Status.WAITING;
                }

                MessageSender.sendMessage(message,groupId);

                QueueInfo queueInfo=QueueInfo.builder()
                    .qname(groupId)
                    .groupName(groupId).build();
                hzCacheManager.updateData(queueInfo, QueueState.IDLE);
                return Status.SUCCESS;
            }
            else
            {
                hzCacheManager.updateSet(HzCacheManager.WAITING_GROUPS_LIST,groupId);
                log.info("{} queues already created. waiting...",limit);
                return Status.WAITING;
            }
        }

    }


}
