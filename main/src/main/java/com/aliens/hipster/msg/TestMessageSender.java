package com.aliens.hipster.msg;

import com.ailiens.common.MsgMessage;
import com.ailiens.common.MsgPublisher;
import com.ailiens.common.PublishResponse;
import com.ailiens.common.UriInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by jayant on 9/3/17.
 */

@Component
public class TestMessageSender {

    @Autowired
    MsgPublisher msgPublisher;

    @Autowired
    ObjectMapper objectMapper;


    public void invoke() throws JsonProcessingException, URISyntaxException {
        MsgMessage msgMessage = new MsgMessage();

        DummyMessage dummyMessage = DummyMessage.builder().name("jayant").gender("male").build();

        String payload= objectMapper.writeValueAsString(dummyMessage);
        msgMessage.setPayload(payload);
        msgMessage.setEventType("TEST_EVENT");

        msgMessage.getUriMap().put("galactus1", UriInfo.builder()
            .uri(new URI("http://localhost:8020/event/msgEvent"))
            .method("POST")
            .timeout(60)
            .build()
        );

        msgMessage.getUriMap().put("galactus2", UriInfo.builder()
            .uri(new URI("http://localhost:8020/event/msgEvent"))
            .timeout(60)
            .method("POST")
            .build()
        );


        PublishResponse publishResponse =msgPublisher.publish(msgMessage,"test");
    }
}
