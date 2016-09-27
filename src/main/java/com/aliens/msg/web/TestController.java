package com.aliens.msg.web;

import com.aliens.hipster.repository.ClientsRepository;
import com.aliens.msg.hazelcast.Constants;
import com.aliens.msg.mmq.ThreadWrapper;
import com.aliens.msg.mmq.actions.VerifyGrouping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aliens.msg.hazelcast.HzCacheManager;
import com.aliens.msg.hazelcast.HzStat;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.Status;
import com.aliens.msg.mmq.receiver.GroupQueueMessageReceiver;
import com.aliens.msg.mmq.actions.MessageSender;
import com.rabbitmq.client.AMQP;

import java.util.Set;

/**
 * Created by jayant on 25/9/16.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    HzCacheManager hzCacheManager;

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

        HzStat hzStat = hzCacheManager.getStat();
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



    @RequestMapping(value = "/delete/{queueName}",
        method = RequestMethod.GET,
        produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<?> deleteQueue(@PathVariable("queueName") String queue) throws Exception {

        hzCacheManager.getInstance().getMap(Constants.QUEUE_MAPPINGS).remove(queue);
        return ResponseEntity.ok().body("deleted");
    }

    @RequestMapping(value = "/testSendTOMycroft",
            method = RequestMethod.POST,
            produces = MediaType.TEXT_PLAIN_VALUE)
        public Status sendMessageToMycroft() throws Exception {

    		Message msg = new Message();
    		msg.setCreatedAt("2016-10-23");
    		msg.setGroupId("g1");
    		msg.setPayload("{\"abc\":\"ASdssfs \"}");
    		msg.setMessageId("m1");

    		GroupQueueMessageReceiver gqmr = new GroupQueueMessageReceiver();

    		AMQP.BasicProperties properties = new AMQP.BasicProperties();

    		return gqmr.action(msg, properties);
//            return ResponseEntity.ok().body("sent");
        }




}
