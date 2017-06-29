package com.aliens.hipster.msg;

import static com.ailiens.common.PublishResponse.PUBLISHED;
import static org.junit.Assert.assertEquals;

import com.ailiens.common.MsgMessage;
import com.ailiens.common.MsgPublisher;
import com.ailiens.common.OutboundMessage;
import com.ailiens.common.OutboundMessageRepository;
import com.ailiens.common.PublishResponse;
import com.ailiens.common.RetryMessages;
import com.aliens.hipster.CommonsApp;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jayant on 5/3/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommonsApp.class)
@Slf4j
public class MsgTest {

    @Autowired
    MsgPublisher msgPublisher;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    RetryMessages retryMessages;

    @Autowired
    OutboundMessageRepository outboundMessageRepository;


    @Test
    @SneakyThrows
    public void publishTest()
    {
        MsgMessage msgMessage = new MsgMessage();

        DummyMessage dummyMessage = DummyMessage.builder().name("jayant").gender("male").build();

        String payload= objectMapper.writeValueAsString(dummyMessage);
        msgMessage.setPayload(payload);
        msgMessage.setEventType("TEST_EVENT");
        PublishResponse publishResponse =msgPublisher.exchangePublish(msgMessage,"test");

        assertEquals(PUBLISHED,publishResponse);
    }


    @Test
    public void longMessageTest()
    {
        StringBuffer buffer = new StringBuffer();
        for(int i=0;i<1000000l;i++)
            buffer.append('a');

        String payload=buffer.toString();
        MsgMessage message = new MsgMessage();
        message.setPayload(payload);
        msgPublisher.publish(message,"test");
    }

    @Test
    public void outBoundTest()
    {
        StringBuffer buffer = new StringBuffer();
        for(int i=0;i<100l;i++)
            buffer.append('a');

        String payload=buffer.toString();

        OutboundMessage outboundMessage = new OutboundMessage();

        outboundMessage.setPayload(payload);
        outboundMessage.setStatus(payload);

        outboundMessageRepository.save(outboundMessage);
    }

    @Test
    @SneakyThrows
    public void retryTest()
    {
        retryMessages.retry();
    }
}
