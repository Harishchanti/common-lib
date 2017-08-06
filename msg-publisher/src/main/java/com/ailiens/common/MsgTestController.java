package com.ailiens.common;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jayant on 16/1/17.
 */
@RestController
@RequestMapping("/msg")
@Transactional
public class MsgTestController {

    @Autowired
    MsgPublisher msgPublisher;

    @Autowired
    RetryMessages retryMessages;

    @Autowired(required = false)
    MessageLoggingService messageLogger;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> test() throws Exception {

        MsgMessage msgMessage = new MsgMessage();
        msgMessage.setPayload("test message");
        msgPublisher.publish(msgMessage,"test");
        return ResponseEntity.ok("sent test message to MSG");
    }


    @RequestMapping(value = "/retry/{pageSize}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> retry(@PathVariable int pageSize) throws Exception {

        int num=retryMessages.invoke(pageSize);
        return ResponseEntity.ok(num);
    }

    @RequestMapping(value = "/outbound/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<? extends MsgOutbound> search(@RequestParam(value = "messageId") String messageId) throws Exception {

        return Optional.ofNullable(messageLogger)
            .map(logger->  logger.search(messageId))
             .orElse(null);
    }

}
