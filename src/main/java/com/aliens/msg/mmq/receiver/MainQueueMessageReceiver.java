package com.aliens.msg.mmq.receiver;

import com.aliens.msg.hazelcast.Constants;
import com.aliens.msg.hazelcast.HzCacheManager;
import com.aliens.msg.hazelcast.QueueInfo;
import com.aliens.msg.hazelcast.QueueState;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.Status;
import com.aliens.msg.mmq.actions.MessageSender;
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

    @Autowired
    MessageSender messageSender;

    @Override
    public Status action(Message message, AMQP.BasicProperties properties) throws Exception {

        String groupId=message.getGroupId();

        if(Strings.isNullOrEmpty(groupId))
            return Status.FAILED;

        Optional<QueueInfo> queueInfoOptional= hzCacheManager.findByGroupId(groupId);

        if(queueInfoOptional.isPresent())
        {
            String qname=queueInfoOptional.get().getQname();
            messageSender.sendMessage(message,qname);
            return Status.SUCCESS;
        }
        else
        {
            int size=hzCacheManager.getSize();
            if(size<rabbitMqConfig.getQueueLimit())
            {

                if(hzCacheManager.isWaiting(groupId))
                {
                    return Status.WAITING;
                }

                messageSender.sendMessage(message,groupId);

                QueueInfo queueInfo=QueueInfo.builder()
                    .qname(groupId)
                    .groupName(groupId).build();

                hzCacheManager.updateData(queueInfo, QueueState.IDLE);

                return Status.SUCCESS;
            }
            else
            {
                hzCacheManager.updateSet(Constants.WAITING_GROUPS_LIST,groupId);
                log.info("queues limit crossed: {} . waiting...",rabbitMqConfig.getQueueLimit());
                return Status.WAITING;
            }
        }

    }


}
