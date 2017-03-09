package com.aliens.hipster.msg;

import com.ailiens.common.CommonMsgEventHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    public String handle(String payload) throws Exception {
        DummyMessage dummyMessage = objectMapper.readValue(payload,DummyMessage.class);

        if(true)
        {
            throw new Exception("test exception");
        }
        return "Test message success";
    }
}
