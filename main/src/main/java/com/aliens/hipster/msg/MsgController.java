package com.aliens.hipster.msg;

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
@RequestMapping("/msgtest")
public class MsgController {

    @Autowired
    TestMessageSender testMessageSender;

    @RequestMapping(value = "/sendMessage",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<?> processMsgEvent() throws Exception {

         testMessageSender.invoke();
         return ResponseEntity.status(200).body("sent test message");
    }
}
