package com.aliens.msg.mmq.actions;

import com.aliens.msg.hazelcast.Constants;
import com.aliens.msg.hazelcast.HzCacheManager;
import com.aliens.msg.mmq.ChannelResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Provider;
import java.util.UUID;

/**
 * Created by jayant on 25/9/16.
 */
@Slf4j
@Component
public class MainQueueWorker implements Runnable {

    @Autowired
    HzCacheManager cacheManager;

    @Autowired
    Provider<MainQueueMessageReceiver> mainQueueMessageReceiverProvider;


    @Override
    public void run() {

        String threadName = UUID.randomUUID().toString();
        Thread.currentThread().setName(threadName);

        cacheManager.updateSet(Constants.MAIN_QUEUE_WORKER_LIST, threadName);

        while (true) {
            ChannelResponse response = mainQueueMessageReceiverProvider
                .get()
                .withTimeout(10 * 1000)
                .withThreadName(threadName)
                .withQueueName(Constants.MAIN_QUEUE_NAME)
                .consumeMessages();

            log.info("MainQueue consumer response: {}",response);

            switch (response) {
                case QUEUE_PROCESSED:
                case SCHEDULED_RESTART:
                case RESTART:
                    log.info("Restarting mainQueue consumer thread");
                    cacheManager.clearWaitingList();
                    break;
                case ERROR:
                case MESSAGE_FAILED:
                    log.error("Got error while processing main queue");
            }
        }

    }
}
