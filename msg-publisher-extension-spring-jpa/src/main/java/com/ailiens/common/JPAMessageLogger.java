package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 12/2/17.
 */


@Component
@Slf4j
public class JPAMessageLogger implements MessageLoggingService {

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

    @Override
    public void saveUndiveleredMessage(MsgMessage message, String topic, String exceptionMessage) {
        OutboundMessage outboundMessage = mapper.convertValue(message, OutboundMessage.class);
        outboundMessage.setTopic(topic);
        outboundMessage.setSent(false);
        outboundMessage.setStatus(exceptionMessage);
        outboundMessageRepository.save(outboundMessage);
    }


}
