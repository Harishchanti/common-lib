package com.ailiens.common.restutil;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

/**
 * Created by jayant on 24/11/16.
 */


@Component
@Singleton
@Slf4j
public class RestClientSetup {

    @Autowired
    RestUtil restUtil;

    @PostConstruct
    public void setup()
    {
       restUtil.setup();
        log.info("Setup done");
    }
}
