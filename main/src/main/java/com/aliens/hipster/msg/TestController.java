package com.aliens.hipster.msg;

import com.ailiens.common.restutil.RestUtilProvider;
import com.codahale.metrics.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jayant on 9/3/17.
 */

@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    TestMessageSender testMessageSender;

    @RequestMapping(value = "/restUtil",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<?> restUtil() throws Exception {

      String response=   RestUtilProvider.getInstance()
                .post("http://localhost:8030/msg/dummy2",new DummyMessage(),String.class)
                .getBody();

        return ResponseEntity.status(200).body("Get call done through restutil");
    }


    @RequestMapping(value = "/sendMessage",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<?> processMsgEvent() throws Exception {


        testMessageSender.invoke();
        return ResponseEntity.status(200).body("sent test message");
    }


}
