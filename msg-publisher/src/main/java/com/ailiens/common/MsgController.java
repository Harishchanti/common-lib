package com.ailiens.common;

import com.codahale.metrics.annotation.Timed;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jayant on 22/11/16.
 */

@RestController
@RequestMapping("/msgApi")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class MsgController {

    final MsgPublisher msgPublisher;

    @RequestMapping(value = "/sendTestMessage", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public void test() throws Exception {

        MsgMessage msgMessage = new MsgMessage();
        msgMessage.setPayload("test");
        msgMessage.setEventId("1");
        msgMessage.setEventType("TEST");
        msgPublisher.publish(msgMessage,"msg_test");

    }

}
