package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

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
      log.info("Retrying {} messages",outboundMessageList.size());

      for(OutboundMessage outboundMessage : outboundMessageList) {
          MsgMessage msgMessage=objectMapper.convertValue(outboundMessage,MsgMessage.class);

          outboundMessage.incRetries();

          PublishResponse response=msgPublisher
              .withLogging(false)
              .withExceptionLogging(false)
              .exchangePublish(msgMessage,outboundMessage.getTopic());


          if(response==PublishResponse.PUBLISHED)
          {
              outboundMessage.setSent(true);
          }
      }
      return  outboundMessageList.size();
  }
}
