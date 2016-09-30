package com.aliens.hipster.web;

import com.aliens.msg.hazelcast.CacheManager;
import com.aliens.msg.mmq.ConnectionFactoryProxy;
import com.aliens.msg.mmq.ThreadWrapper;
import com.aliens.msg.utils.RestUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by jayant on 30/9/16.
 */

@Component
@Slf4j
public class Initialize {

    @Autowired
    ConnectionFactoryProxy connectionFactoryProxy;
    @Autowired
    CacheManager cacheManager;
    @Autowired
    ThreadWrapper threadWrapper;

    @PostConstruct
    public void setup()
    {
        connectionFactoryProxy.setup();
        RestUtil.setupUnirest();
        cacheManager.setup();
        threadWrapper.setup();
        log.info("Setup done");
    }
}
