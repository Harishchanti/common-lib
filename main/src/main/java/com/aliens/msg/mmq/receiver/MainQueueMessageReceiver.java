package com.aliens.msg.mmq.receiver;
import com.ailiens.common.Message;
import com.ailiens.common.RabbitMqMessageSender;
import com.aliens.msg.actions.BackupQueueInfoProxy;
import com.aliens.msg.hazelcast.CacheManager;
import com.aliens.msg.hazelcast.QueueInfo;
import com.aliens.msg.hazelcast.QueueState;
import com.aliens.msg.mmq.Status;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

import static com.aliens.msg.Constants.timeZone;

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
    BackupQueueInfoProxy backupQueueInfoProxy;

    @Autowired
    RabbitMqMessageSender rabbitMqMessageSender;

    @Override
    public Status action(Message message) throws Exception {

        String groupId=message.getGroupId();
        String clientName=client.getName();

        if(Strings.isNullOrEmpty(groupId))
            return Status.FAILED;

        Optional<QueueInfo> queueInfoOptional= cacheManager.findByGroupId(groupId);

        if(queueInfoOptional.isPresent())
        {
            String qname=queueInfoOptional.get().getQueueName();
            rabbitMqMessageSender.sendMessage(message,qname);
            return Status.SUCCESS;
        }
        else
        {
            int size= cacheManager.getSize();
            if(size<rabbitMqConfig.getQueueLimit())
            {

                if(cacheManager.isWaiting(clientName,groupId))
                {
                    return Status.WAITING;
                }

                String queueName = UUID.randomUUID().toString();

                rabbitMqMessageSender.sendMessage(message,queueName);

                QueueInfo queueInfo=QueueInfo.builder()
                    .queueName(queueName)
                    .createdAt(LocalDateTime.now(timeZone).toString())
                    .clientName(clientName)
                    .groupName(groupId)
                    .build();

                cacheManager.updateData(queueInfo, QueueState.IDLE);
                cacheManager.updateAvailbleQueue(clientName,groupId);
                backupQueueInfoProxy.save(queueInfo);
                return Status.SUCCESS;
            }
            else
            {
                cacheManager.putToWait(clientName,groupId);
                log.info("queues limit crossed: {} . waiting...",rabbitMqConfig.getQueueLimit());
                return Status.WAITING;
            }
        }

    }


}