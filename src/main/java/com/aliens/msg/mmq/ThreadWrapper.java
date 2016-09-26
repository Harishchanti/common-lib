package com.aliens.msg.mmq;

import com.aliens.msg.mmq.actions.GroupQueueWorker;
import com.aliens.msg.mmq.actions.MainQueueWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Provider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

    ExecutorService executorService = Executors.newFixedThreadPool(10);

    public void setup()
    {
        executorService.submit(mainQueueWorkerProvider.get());
        executorService.submit(groupQueueWorkerProvider .get());
    }


}
