package com.ailiens.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jayant on 12/2/17.
 */
@Component
@Slf4j
public class JPAMessageRetry implements MessageRetryService<OutboundMessage> {

    @Autowired
    OutboundMessageRepository outboundMessageRepository;



    @Override
    public List<OutboundMessage> getFailedMessages(int pageSize) {
        return  outboundMessageRepository.getFailedMessages(new PageRequest(0,pageSize));
    }

    @Override
    public void incRetry(OutboundMessage object) {
        object.incRetries();
    }

    @Override
    public void setDelivered(OutboundMessage object) {
       object.setSent(true);
    }
}
