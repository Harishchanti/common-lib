package com.aliens.hipster.msg;

import com.ailiens.common.CommonMsgEventHandler;
import com.ailiens.common.MsgMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by jayant on 6/3/17.
 */
@Component
public class TestEventHandler  extends CommonMsgEventHandler {

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public String getEventType() {
        return "TEST_EVENT";
    }

    @Override
    public String handle(MsgMessage msgMessage) throws Exception {
        String payload = msgMessage.getPayload();
        Map<String,String> headers= msgMessage.getHeaders();

        DummyMessage dummyMessage = objectMapper.readValue(payload,DummyMessage.class);

        return "Test message success";
    }
}
