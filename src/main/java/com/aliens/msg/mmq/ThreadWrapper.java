package com.aliens.msg.mmq;

import com.aliens.hipster.domain.Clients;
import com.aliens.hipster.repository.ClientsRepository;
import com.aliens.msg.hazelcast.CacheManager;
import com.aliens.msg.hazelcast.Constants;
import com.aliens.msg.mmq.test.TestMessageSender;
import com.aliens.msg.mmq.worker.GroupQueueWorker;
import com.aliens.msg.mmq.worker.MainQueueWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Provider;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Created by jayant on 25/9/16.
 */
@Slf4j
@Component
public class ThreadWrapper {

    @Autowired
    Provider<GroupQueueWorker> groupQueueWorkerProvider;

    @Autowired
    Provider<MainQueueWorker> mainQueueWorkerProvider;

    @Autowired
    Provider<TestMessageSender> testMessageSenderProvider;

    @Autowired
    ClientsRepository clientsRepository;

    @Autowired
    CacheManager cacheManager;

    ExecutorService executorService = Executors.newFixedThreadPool(50);

    public void setup()
    {

    	List<Clients> clients = clientsRepository.findAll();

    	clients.stream().forEach(client -> {

            IntStream.range(0,1).forEach( (x)->executorService.submit(mainQueueWorkerProvider.get().withClient(client)));
            IntStream.range(0,client.getConsumerCount()).forEach( (x)->

                executorService.submit(groupQueueWorkerProvider.get().withClient(client)));

            cacheManager.updateSet(Constants.CLIENTS,client.getName());

            IntStream.range(0,4)
                .forEach( (x)->executorService.submit(
                    testMessageSenderProvider.get().withQueName(client.getTopic())
                        .withGroupId(client.getName()+"_g"+String.valueOf(x))));
    	});



    }
}
