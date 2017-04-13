package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jayant on 20/2/17.
 */

@Component
@Primary
public class JPAInboundLogger implements InboundLoggingService {

    @Autowired
    InboundMessagesRepository inboundMessagesRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public List<String> findByMessageId(String messageId) {
        return inboundMessagesRepository.findByMessageId(messageId);
    }

    @Override
    public void save(MsgMessage message,String response,String handlerResponse) {

        InboundMessages inboundMessages = objectMapper.convertValue(message,InboundMessages.class);
        inboundMessages.setResponse(response);
        inboundMessages.setHandlerResponse(handlerResponse);
        inboundMessagesRepository.save(inboundMessages);
    }
}
