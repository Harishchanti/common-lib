package com.aliens.msg.mmq.actions;

import com.aliens.msg.hazelcast.HzCacheManager;
import com.aliens.msg.mmq.ChannelResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Provider;
import java.util.UUID;

/**
 * Created by jayant on 25/9/16.
 */
@Slf4j
public class MainQueueWorker implements Runnable {

    @Autowired
    HzCacheManager cacheManager;

    @Autowired
    Provider<MainQueueMessageReceiver> mainQueueMessageReceiverProvider;

    final String mainQueuName = "hello";

    @Override
    public void run() {

        String threadName= UUID.randomUUID().toString();
        Thread.currentThread().setName(threadName);

        cacheManager.updateSet("workerThreads",threadName);

        while (true) {
            ChannelResponse response = mainQueueMessageReceiverProvider
                .get()
                .withTimeout(60 * 1000)
                .withThreadName(threadName)
                .withQueueName(mainQueuName)
                .consumeMessages();

            if (response == ChannelResponse.QUEUE_PROCESSED) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (response == ChannelResponse.RESTART) {
                {
                    cacheManager.clearWaitingList();
                }
            } else {
                log.error("Got error while processing main queue");
            }

        }

    }
}
