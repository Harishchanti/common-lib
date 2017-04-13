package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yashika on 16/2/17.
 */

@Component
public class MessageLogging implements MessageLoggingService {
    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    OutboundMessageRepository outboundMessageRepository;

    @Override
    public void save(MsgMessage message, String topic) {

        OutboundMessage outboundMessage= mapper.convertValue(message,OutboundMessage.class);
        outboundMessage.setTopic(topic);
        outboundMessageRepository.save(outboundMessage);
    }

    @Override
    public void saveUndelivered(MsgMessage message, String topic, String exceptionMessage) {
        OutboundMessage outboundMessage= mapper.convertValue(message,OutboundMessage.class);
        outboundMessage.setTopic(topic);
        outboundMessage.setSent(false);
        outboundMessage.setStatus(exceptionMessage);
        outboundMessageRepository.save(outboundMessage);
    }
}
