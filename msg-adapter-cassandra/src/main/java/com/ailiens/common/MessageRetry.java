package com.ailiens.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yashika on 17/2/17.
 */
@Component
public class MessageRetry implements MessageRetryService<OutboundMessage> {

    @Autowired
    OutboundMessageRepository outboundMessageRepository;

    @Override
    public List<OutboundMessage> getFailedMessages(int pageSize) {
        return  outboundMessageRepository.getFailedMessages(new PageRequest(0,pageSize));
    }

    @Override
    public void incRetry(OutboundMessage object) {
        object.incRetries();
        outboundMessageRepository.save(object);
    }

    @Override
    public void setDelivered(OutboundMessage object) {
        object.setSent(true);
        outboundMessageRepository.save(object);
    }
}
