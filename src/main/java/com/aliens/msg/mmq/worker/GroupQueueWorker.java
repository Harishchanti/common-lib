package com.aliens.msg.mmq.worker;

import com.aliens.hipster.domain.Clients;
import com.aliens.msg.config.RabbitMqConfig;
import com.aliens.msg.hazelcast.CacheManager;
import com.aliens.msg.hazelcast.Constants;
import com.aliens.msg.hazelcast.QueueInfo;
import com.aliens.msg.hazelcast.QueueState;
import com.aliens.msg.mmq.ChannelResponse;
import com.aliens.msg.mmq.receiver.GroupQueueMessageReceiver;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Provider;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by jayant on 25/9/16.
 */

@Slf4j
@Scope("prototype")
@Data
@Component
@AllArgsConstructor
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GroupQueueWorker implements Runnable {


    final CacheManager cacheManager;
    final RabbitMqConfig rabbitMqConfig;
    final Provider<GroupQueueMessageReceiver> groupQueueMessageReceiverProvider;

    @Wither
    Clients client;

    public void run()
    {
        String threadName= client.getName()+"_"+UUID.randomUUID().toString();
        Thread.currentThread().setName(threadName);

        //Todo : dont allow more than one consumer for same client
        cacheManager.updateSet(Constants.GROUP_QUEUE_WORKER_LIST,threadName);

        while(true)
        {
            Optional<QueueInfo> queueInfoOptional = cacheManager.findIdleQueue(client.getName());
            long sleepInterval =rabbitMqConfig.getSleepInterval();

            if(queueInfoOptional.isPresent())
            {
                QueueInfo queueInfo =queueInfoOptional.get();
                String qname=queueInfo.getQname();
                queueInfo.setThreadName(threadName);
                cacheManager.updateData(queueInfo, QueueState.PROCESSING);

                ChannelResponse response=groupQueueMessageReceiverProvider
                    .get()
                    .withClient(client)
                    .withQueueName(qname)
                    .withThreadName(threadName)
                    .consumeMessages();

                cacheManager.updateData(queueInfo,response);
            }
            else {
                log.info("No idle queue found : let me sleep {}",sleepInterval);
                try {
                    Thread.sleep(sleepInterval,0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }





}
