package com.aliens.hipster.msg;

import com.ailiens.common.MsgMessage;
import com.ailiens.common.MsgPublisher;
import com.ailiens.common.PublishResponse;
import com.ailiens.common.RetryMessages;
import com.aliens.hipster.MsgApp;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.ailiens.common.PublishResponse.PUBLISHED;
import static org.junit.Assert.assertEquals;

/**
 * Created by jayant on 5/3/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MsgApp.class)
@Slf4j
public class MsgTest {

    @Autowired
    MsgPublisher msgPublisher;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    RetryMessages retryMessages;


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

        log.info(publishResponse.name());

        assertEquals(PUBLISHED,publishResponse);

    }

    @Test
    @SneakyThrows
    public void retryTest()
    {
        retryMessages.retry();
    }
}
