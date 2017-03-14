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
            .uri(new URI("https://kong-qa.ailiens.com:8443/galactus/"))
            .method("GET")
            .timeout(60)
            .build()
        );

        msgMessage.getUriMap().put("galactus2", UriInfo.builder()
            .uri(new URI("https://kong-qa.ailiens.com:8443/galactusReloaded/"))
            .timeout(60)
            .method("GET")
            .build()
        );


        PublishResponse publishResponse =msgPublisher.publish(msgMessage,"test");
    }
}
