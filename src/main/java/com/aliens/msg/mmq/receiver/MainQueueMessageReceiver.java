package com.aliens.msg.mmq.receiver;

import com.aliens.msg.hazelcast.CacheManager;
import com.aliens.msg.hazelcast.Constants;
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
    CacheManager cacheManager;

    @Autowired
    MessageSender messageSender;

    @Override
    public Status action(Message message, AMQP.BasicProperties properties) throws Exception {

        String groupId=message.getGroupId();

        if(Strings.isNullOrEmpty(groupId))
            return Status.FAILED;

        Optional<QueueInfo> queueInfoOptional= cacheManager.findByGroupId(groupId);

        if(queueInfoOptional.isPresent())
        {
            String qname=queueInfoOptional.get().getQname();
            messageSender.sendMessage(message,qname);
            return Status.SUCCESS;
        }
        else
        {
            int size= cacheManager.getSize();
            if(size<rabbitMqConfig.getQueueLimit())
            {

                if(cacheManager.isWaiting(groupId))
                {
                    return Status.WAITING;
                }

                messageSender.sendMessage(message,groupId);

                QueueInfo queueInfo=QueueInfo.builder()
                    .qname(groupId)
                    .groupName(groupId).build();

                cacheManager.updateData(queueInfo, QueueState.IDLE);
                cacheManager.updateAvailbleQueue(groupId);
                return Status.SUCCESS;
            }
            else
            {
                cacheManager.updateSet(Constants.WAITING_GROUPS,groupId);
                log.info("queues limit crossed: {} . waiting...",rabbitMqConfig.getQueueLimit());
                return Status.WAITING;
            }
        }

    }


}
