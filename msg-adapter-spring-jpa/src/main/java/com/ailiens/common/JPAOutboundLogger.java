package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Map.Entry;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jayant on 12/2/17.
 */


@Component
public class JPAOutboundLogger implements MessageLoggingService {

    @Autowired
    ObjectMapper mapper;

    @Autowired
    OutboundMessageRepository outboundMessageRepository;




    @Override
    @Transactional
    public void save(MsgMessage message, String topic) {

        OutboundMessage outboundMessage = mapper.convertValue(message, OutboundMessage.class);
        outboundMessage.setTopic(topic);
        if(message.getUriMap()!=null && !message.getUriMap().isEmpty())
        {
            saveWithUriMap(outboundMessage,message);

        }
        else outboundMessageRepository.save(outboundMessage);

    }

    @Override
    @Transactional
    public void saveUndelivered(MsgMessage message, String topic, String exceptionMessage) {
        OutboundMessage outboundMessage = mapper.convertValue(message, OutboundMessage.class);
        outboundMessage.setTopic(topic);
        outboundMessage.setSent(false);
        outboundMessage.setStatus(exceptionMessage);
        if(message.getUriMap()!=null && !message.getUriMap().isEmpty())
        {
            saveWithUriMap(outboundMessage,message);

        }
        else outboundMessageRepository.save(outboundMessage);
    }

    @Override
    public List<OutboundMessage> search(String messageId)
    {
        return outboundMessageRepository.searchByMessageId(messageId);
    }

    private void saveWithUriMap(OutboundMessage outboundMessage,MsgMessage msgMessage)
    {
        for(Entry<String,UriInfo> entry: msgMessage.getUriMap().entrySet())
        {
            String serviceName =entry.getKey();
            OutboundMessage outboundMessage1 = new OutboundMessage();
            BeanUtils.copyProperties(outboundMessage,outboundMessage1);
            String msgId=outboundMessage1.getMessageId();
            outboundMessage1.setMessageId(msgId+"-"+serviceName);
            outboundMessage1.setUrl(entry.getValue().getUri().toString());
            outboundMessage1.setMethod(entry.getValue().getMethod());
            outboundMessageRepository.save(outboundMessage1);
        }
    }


}
