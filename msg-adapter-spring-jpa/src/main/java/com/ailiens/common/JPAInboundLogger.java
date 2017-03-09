package com.ailiens.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jayant on 20/2/17.
 */

@Component
public class JPAInboundLogger implements InboundLoggingService {

    @Autowired
    InboundMessagesRepository inboundMessagesRepository;

    @Override
    public List<String> findByMessageId(String messageId) {
        return inboundMessagesRepository.findByMessageId(messageId);
    }

    @Override
    public void save(MsgMessage message,String response,String handlerResponse) {

        InboundMessages inboundMessages = new InboundMessages();
        inboundMessages.setGroupId(message.getGroupId());
        inboundMessages.setMessageId(message.getMessageId());
        inboundMessages.setPayload(message.getPayload());
        inboundMessages.setResponse(response);
        inboundMessages.setHandlerResponse(handlerResponse);
        inboundMessagesRepository.save(inboundMessages);
    }
}
