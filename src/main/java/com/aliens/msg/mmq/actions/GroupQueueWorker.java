package com.aliens.msg.mmq.actions;

import com.aliens.msg.hazelcast.Constants;
import com.aliens.msg.hazelcast.HzCacheManager;
import com.aliens.msg.hazelcast.QueueInfo;
import com.aliens.msg.hazelcast.QueueState;
import com.aliens.msg.mmq.ChannelResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Provider;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by jayant on 25/9/16.
 */

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class GroupQueueWorker implements Runnable {

    @Autowired
    HzCacheManager cacheManager;

    @Autowired
    Provider<GroupQueueMessageReceiver> groupQueueMessageReceiverProvider;

    public void run()
    {
        String threadName= UUID.randomUUID().toString();
        Thread.currentThread().setName(threadName);

        cacheManager.updateSet(Constants.GROUP_QUEUE_WORKER_LIST,threadName);

        while(true)
        {
            Optional<QueueInfo> queueInfoOptional = cacheManager.findIdleQueue();

            if(queueInfoOptional.isPresent())
            {
                QueueInfo queueInfo =queueInfoOptional.get();
                String qname=queueInfo.getQname();
                queueInfo.setThreadName(threadName);
                cacheManager.updateData(queueInfo, QueueState.PROCESSING);

                ChannelResponse response=groupQueueMessageReceiverProvider
                    .get()
                    .withQueueName(qname)
                    .withThreadName(threadName)
                    .consumeMessages();

                cacheManager.updateData(queueInfo,response);
            }
            else {
                log.info("No idle queue, sleeping for 4 sec");
                try {
                    Thread.sleep(4000,0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }





}
