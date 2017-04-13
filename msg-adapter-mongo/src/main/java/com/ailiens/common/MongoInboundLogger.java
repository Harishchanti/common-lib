package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jayant on 1/4/17.
 */
@Component
@EnableMongoRepositories
public class MongoInboundLogger implements InboundLoggingService {

    @Autowired
    InboundMessageRepository inboundMessageRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public List<String> findByMessageId(String messageId) {

        List<InboundMessage> list=inboundMessageRepository.findByMessageId(messageId);
        return list.stream().map(InboundMessage::getStatus).collect(Collectors.toList());
    }

    @Override
    public void save(MsgMessage message, String response, String handlerResponse) {
        InboundMessage inboundMessage =  objectMapper.convertValue(message,InboundMessage.class);
        inboundMessage.setStatus(response);
        inboundMessage.setHandlerResponse(handlerResponse);
        inboundMessageRepository.save(inboundMessage);
    }
}
