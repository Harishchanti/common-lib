package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by jayant on 17/1/17.
 */

@Component
@Slf4j
public class RetryMessages {

    @Autowired(required = false)
    MessageRetryService messageRetryService;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    MsgPublisher msgPublisher;


    public int invoke(int pageSize) {
        List<MsgOutbound> outboundMessageList = messageRetryService.getFailedMessages(pageSize);

        if (outboundMessageList.size() == 0) return 0;

        for (MsgOutbound outboundMessage : outboundMessageList) {
            MsgMessage msgMessage = objectMapper.convertValue(outboundMessage, MsgMessage.class);

            messageRetryService.incRetry(outboundMessage);

            log.info("Retrying  message: {}", msgMessage.getMessageId());

            PublishResponse response = msgPublisher.retry(msgMessage, outboundMessage.getTopic());

            if (response == PublishResponse.PUBLISHED) {
                messageRetryService.setDelivered(outboundMessage);
            }
        }
        return outboundMessageList.size();

    }


    @Scheduled(cron = "0 */15  * * * ?")
    @Transactional
    public void retry() {
        if (messageRetryService != null)
        {
            invoke(100);
        }

    }
}
