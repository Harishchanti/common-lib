package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import javax.transaction.Transactional;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

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


    @SneakyThrows
    public int invoke(int pageSize) {
        List<MsgOutbound> outboundMessageList = messageRetryService.getFailedMessages(pageSize);

        if (outboundMessageList.size() == 0) return 0;

        for (MsgOutbound outboundMessage : outboundMessageList) {
            MsgMessage msgMessage = objectMapper.convertValue(outboundMessage, MsgMessage.class);

            if(!Strings.isNullOrEmpty(outboundMessage.getUrl()))
            {
                msgMessage.setUriMap(new HashMap<>());
                msgMessage.getUriMap().put("retry", UriInfo.builder()
                    .uri(new URI(outboundMessage.getUrl()))
                    .method(outboundMessage.getMethod())
                    .timeout(60)
                    .build()
                );
            }

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
