package com.aliens.msg.web;

import com.aliens.hipster.repository.ClientsRepository;
import com.aliens.msg.hazelcast.CacheManager;
import com.aliens.msg.hazelcast.HzStat;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.ThreadWrapper;
import com.aliens.msg.mmq.actions.MessageSender;
import com.aliens.msg.mmq.actions.VerifyGrouping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Created by jayant on 25/9/16.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    CacheManager cacheManager;

    @Autowired
    ThreadWrapper threadWrapper;

    @Autowired
    VerifyGrouping verifyGrouping;

    @Autowired
    MessageSender messageSender;

    @Autowired
    ClientsRepository clientsRepository;

    @RequestMapping(value = "",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> stat() throws Exception {

        HzStat hzStat = cacheManager.getStat();
        return ResponseEntity.ok().body(hzStat);
    }

    @RequestMapping(value = "/clients",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getClients() throws Exception {


        return ResponseEntity.ok().body(clientsRepository.findAll());
    }




    @RequestMapping(value = "/verify",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> verify() throws Exception {

        Set<String> result=verifyGrouping.invoke();
        return ResponseEntity.ok().body(result);
    }

    @RequestMapping(value = "/testresponse",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<?> testResponse() throws Exception {

            String result = "true";
            return ResponseEntity.ok().body(result);
        }

    @RequestMapping(value = "/start",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> startTest() throws Exception {

        threadWrapper.setup();
        return ResponseEntity.ok().body("start");
    }

    @RequestMapping(value = "/sendMessage",
        method = RequestMethod.POST,
        produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<?> sendMessage(@RequestBody  Message message) throws Exception {

        messageSender.sendMessage(message,"hello");
        return ResponseEntity.ok().body("sent");
    }



}
