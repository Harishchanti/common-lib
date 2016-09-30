package com.aliens.msg.mmq.worker;

import com.aliens.hipster.domain.Clients;
import com.aliens.msg.hazelcast.CacheManager;
import com.aliens.msg.hazelcast.Constants;
import com.aliens.msg.mmq.ChannelResponse;
import com.aliens.msg.mmq.receiver.MainQueueMessageReceiver;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Provider;
import java.util.UUID;

/**
 * Created by jayant on 25/9/16.
 */
@Slf4j
@Component
@Scope("prototype")
@AllArgsConstructor
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MainQueueWorker implements Runnable {


    final CacheManager cacheManager;
    final Provider<MainQueueMessageReceiver> mainQueueMessageReceiverProvider;

    @Wither
    Clients client;


    @Override
    public void run() {

        String threadName = client.getName()+"_"+UUID.randomUUID().toString();
        Thread.currentThread().setName(threadName);

        cacheManager.updateSet(Constants.MAIN_QUEUE_WORKER_LIST, threadName);

        while (true) {
            ChannelResponse response = mainQueueMessageReceiverProvider
                .get()
                .withThreadName(threadName)
                .withClient(client)
                .withQueueName(client.getTopic())
                .consumeMessages();

            log.info("MainQueue consumer response: {}",response);

            switch (response) {
                case QUEUE_PROCESSED:
                case SCHEDULED_RESTART:
                case RESTART:
                    log.info("Restarting mainQueue consumer thread");
                    cacheManager.clearWaitingList(client.getName());
                    break;
                case ERROR:
                case MESSAGE_FAILED:
                    log.error("Got error while processing main queue");
            }
        }

    }
}
