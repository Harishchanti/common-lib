package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Transactional
    public void save(MsgMessage message, String topic) {

        OutboundMessage outboundMessage = mapper.convertValue(message, OutboundMessage.class);
        outboundMessage.setTopic(topic);
        outboundMessageRepository.save(outboundMessage);

    }

    @Override
    @Transactional
    public void saveUndelivered(MsgMessage message, String topic, String exceptionMessage) {
        OutboundMessage outboundMessage = mapper.convertValue(message, OutboundMessage.class);
        outboundMessage.setTopic(topic);
        outboundMessage.setSent(false);
        outboundMessage.setStatus(exceptionMessage);
        outboundMessageRepository.save(outboundMessage);
    }

    @Override
    public List<OutboundMessage> search(String messageId)
    {
        return outboundMessageRepository.searchByMessageId(messageId);
    }


}
