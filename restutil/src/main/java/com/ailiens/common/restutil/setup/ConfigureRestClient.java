package com.ailiens.common.restutil.setup;

import com.ailiens.common.restutil.RestUtil;
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
public class ConfigureRestClient {

    @Autowired
    RestUtil restUtil;

    @Autowired(required = false)
    RestUtilSetup restUtilSetup;


    @PostConstruct
    public void setup()
    {
        restUtil.setup();
        if(restUtilSetup!=null)
        {
            restUtilSetup.setup();
        }
        log.info("Setup done");
    }
}
