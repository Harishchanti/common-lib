package com.aliens.msg.web;

import com.aliens.msg.hazelcast.HzCacheManager;
import com.aliens.msg.hazelcast.HzStat;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.actions.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jayant on 25/9/16.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    HzCacheManager hzCacheManager;

    @RequestMapping(value = "",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> stat() throws Exception {

        HzStat hzStat = hzCacheManager.getStat();
        return ResponseEntity.ok().body(hzStat);
    }

    @RequestMapping(value = "/sendMessage",
        method = RequestMethod.POST,
        produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<?> sendMessage(@RequestBody  Message message) throws Exception {

        MessageSender.sendMessage(message,"hello");
        return ResponseEntity.ok().body("sent");
    }

    @RequestMapping(value = "/delete/{queueName}",
        method = RequestMethod.GET,
        produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<?> deleteQueue(@PathVariable("queueName") String queue) throws Exception {

        hzCacheManager.getInstance().getMap(HzCacheManager.QUEUE_MAPPINGS).remove(queue);
        return ResponseEntity.ok().body("deleted");
    }



}
