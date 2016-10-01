package com.aliens.msg.init;

import com.aliens.msg.hazelcast.CacheManager;
import com.aliens.msg.mmq.ConnectionFactoryProxy;
import com.aliens.msg.mmq.ThreadWrapper;
import com.aliens.msg.utils.RestUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

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
    @Autowired
    LoadKeycloakUsers loadKeycloakUsers;

    @PostConstruct
    public void setup() throws IOException, TimeoutException {
        RestUtil.setupUnirest();

        connectionFactoryProxy.setup();
        cacheManager.setup();
        threadWrapper.setup();
        loadKeycloakUsers.setup();

        log.info("Setup done");
    }
}
