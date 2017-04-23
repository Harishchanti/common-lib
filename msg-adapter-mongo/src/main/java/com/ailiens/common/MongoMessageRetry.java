package com.ailiens.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jayant on 23/4/17.
 */
@Component
public class MongoMessageRetry implements MessageRetryService<OutboundMessage> {

    @Autowired
    OutboundMessageRepository outboundMessageRepository;

    @Override
    public List<OutboundMessage> getFailedMessages(int pageSize) {
        List<OutboundMessage> outboundMessages = outboundMessageRepository.findBySentIsFalse(new PageRequest(0,pageSize));
        return outboundMessages;
    }

    @Override
    public void incRetry(OutboundMessage outboundMessage) {
        outboundMessage.incRetries();
        outboundMessageRepository.save(outboundMessage);
    }

    @Override
    public void setDelivered(OutboundMessage outboundMessage) {
        outboundMessage.setSent(true);
        outboundMessageRepository.save(outboundMessage);
    }
}
