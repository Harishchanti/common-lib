package com.aliens.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by jayant on 30/9/16.
 */

@Component
@Slf4j
public class Initialize {

    @Autowired
    List<BootStrap> bootStrapList;

    @PostConstruct
    public void setup() throws Exception {

        for(BootStrap instance : bootStrapList)
            instance.setup();

        log.info("Setup done");
    }
}
