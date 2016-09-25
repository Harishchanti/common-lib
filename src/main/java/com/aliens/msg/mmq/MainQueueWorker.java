package com.aliens.msg.mmq;

import com.aliens.msg.hazelcast.HzCacheManager;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Provider;

/**
 * Created by jayant on 25/9/16.
 */
public class MainQueueWorker implements Runnable {

    @Autowired
    HzCacheManager cacheManager;

    @Autowired
    Provider<MainQueueMessageReceiver> mainQueueMessageReceiverProvider;

    final String mainQueuName="hello";

    @Override
    public void run() {

        ChannelResponse response=mainQueueMessageReceiverProvider
                   .get().withQueueName(mainQueuName)
                     .consumeMessages();
    }
}
