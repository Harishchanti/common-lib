package com.ailiens.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jayant on 16/1/17.
 */
@RestController
@RequestMapping("/msg")
public class MsgTestController {

    @Autowired
    MsgPublisher msgPublisher;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> test() throws Exception {

        MsgMessage msgMessage = new MsgMessage();
        msgMessage.setPayload("test message");
        msgPublisher.publish(msgMessage,"test");
        return ResponseEntity.ok("sent test message to MSG");
    }

}
