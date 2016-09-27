package com.aliens.msg.mmq;

import com.aliens.msg.mmq.actions.GroupQueueWorker;
import com.aliens.msg.mmq.actions.MainQueueWorker;
import com.aliens.msg.mmq.test.TestMessageSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Provider;
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

    ExecutorService executorService = Executors.newFixedThreadPool(20);

    public void setup()
    {

        IntStream.range(0,1).forEach( (x)->executorService.submit(mainQueueWorkerProvider .get()));

        IntStream.range(0,5).forEach( (x)->executorService.submit(groupQueueWorkerProvider .get()));

        IntStream.range(0,10).forEach( (x)->executorService.submit(testMessageSenderProvider.get().withGroupId("g"+String.valueOf(x))));

    }


}
