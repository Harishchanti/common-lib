package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * Created by surabhi on 23/4/17.
 */
@Component
public class MongoOutboundLogger implements  MessageLoggingService{

    @Autowired
    ObjectMapper mapper;

    @Autowired
    OutboundMessageRepository outboundMessageRepository;

    @Override
    public void save(MsgMessage message, String topic) {
        OutboundMessage outboundMessage = mapper.convertValue(message, OutboundMessage.class);
        outboundMessage.setTopic(topic);
        outboundMessageRepository.save(outboundMessage);
    }

    public void saveUndelivered(MsgMessage message, String topic, String exceptionMessage) {
        OutboundMessage outboundMessage = mapper.convertValue(message, OutboundMessage.class);
        outboundMessage.setSent(false);
        outboundMessage.setTopic(topic);
        outboundMessage.setStatus(exceptionMessage);
        outboundMessageRepository.save(outboundMessage);
    }

    public List<? extends MsgOutbound> search(String messageId)
    {

        return Collections.emptyList();
    }

}
