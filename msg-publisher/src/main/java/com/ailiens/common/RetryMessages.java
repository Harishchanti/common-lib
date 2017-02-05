package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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

  @Autowired
  OutboundMessageRepository outboundMessageRepository;

  @Autowired
  MsgPublisher msgPublisher;

  @Autowired
  ObjectMapper objectMapper;


    public int invoke(int pageSize )
  {
      List<OutboundMessage> outboundMessageList= outboundMessageRepository.getFailedMessages(new PageRequest(0,pageSize));
      if(outboundMessageList.size()==0)return 0;

      for(OutboundMessage outboundMessage : outboundMessageList) {
          MsgMessage msgMessage=objectMapper.convertValue(outboundMessage,MsgMessage.class);

          outboundMessage.incRetries();

          log.info("Retrying  message: {}",msgMessage.getMessageId());

          PublishResponse response=msgPublisher
              .retry(msgMessage,outboundMessage.getTopic());


          if(response==PublishResponse.PUBLISHED)
          {
              outboundMessage.setSent(true);
          }
      }
      return  outboundMessageList.size();
  }

    @Scheduled(cron = "0 */15  * * * ?")
    @Transactional
    public void retry()
    {
        invoke(100);

    }
}
