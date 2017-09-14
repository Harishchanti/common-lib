package com.ailiens.common;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by jayant on 8/9/17.
 */
public class Test {


    @Scheduled(fixedDelay = 10000)
    @Distributed(name = "kavya")
    public void kavya()
    {
        //do stuff
    }
}
