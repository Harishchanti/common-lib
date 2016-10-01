package com.aliens.msg.mmq;

import com.aliens.msg.init.BootStrap;
import com.aliens.msg.models.ClientStatus;
import com.aliens.msg.models.Clients;
import com.aliens.msg.repositories.ClientsRepository;
import com.aliens.msg.hazelcast.CacheManager;
import com.aliens.msg.hazelcast.Constants;
import com.aliens.msg.mmq.test.TestMessageSender;
import com.aliens.msg.mmq.worker.GroupQueueWorker;
import com.aliens.msg.mmq.worker.MainQueueWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Provider;
import javax.inject.Singleton;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Created by jayant on 25/9/16.
 */
@Slf4j
@Component
@Singleton
public class ThreadWrapper  implements BootStrap {

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

    @Override
    public void setup()
    {

    	List<Clients> clients = clientsRepository.findAll();

    	clients.stream().filter(client-> client.getStatus().equals(ClientStatus.ACTIVE))
            .forEach(
                client -> {

            IntStream.range(0,1).forEach( (x)->executorService.submit(mainQueueWorkerProvider.get().withClient(client)));

            IntStream.range(0,client.getConsumerCount()).forEach( (x)->

                executorService.submit(groupQueueWorkerProvider.get().withClient(client)));

            cacheManager.updateSet(Constants.CLIENTS,client.getName());



    	});

    }

    public void sendTestMessages()
    {
        List<Clients> clients = clientsRepository.findAll();

        clients.stream().filter(client-> client.getStatus().equals(ClientStatus.ACTIVE))
            .forEach(client -> {
                IntStream.range(0,2)
                    .forEach( (x)->executorService.submit(
                        testMessageSenderProvider.get().withQueName(client.getTopic())
                            .withGroupId(client.getName()+"_g"+String.valueOf(x))));
            });
    }
}
