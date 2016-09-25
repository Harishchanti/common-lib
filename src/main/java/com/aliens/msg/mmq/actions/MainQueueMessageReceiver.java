package com.aliens.msg.mmq.actions;

import com.aliens.msg.hazelcast.HzCacheManager;
import com.aliens.msg.hazelcast.QueueInfo;
import com.aliens.msg.hazelcast.QueueState;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.Status;
import com.rabbitmq.client.AMQP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by jayant on 25/9/16.
 */
@Component
@Scope("prototype")
public class MainQueueMessageReceiver extends MessageReceiver {

    @Autowired
    HzCacheManager hzCacheManager;

    final int limit=100;



    @Override
    public Status action(Message message, AMQP.BasicProperties properties) throws Exception {

        int restartState=hzCacheManager.getRestartState();

        if(restartState>0)
        {
            if(!hzCacheManager.isRestarted(threadName))
            {
                hzCacheManager.updateSet("restartedThreads",threadName);
                hzCacheManager.decreaseRestartState();
                return Status.RESTART;
            }
        }


        String groupId=message.getGroupId();
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
                    hzCacheManager.handleRestart();
                    return Status.RESTART;
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
                hzCacheManager.updateSet("waitingGroups",groupId);
                return Status.WAITING;
            }
        }

    }
}
