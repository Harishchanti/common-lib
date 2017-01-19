package com.ailiens.common;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by jayant on 23/11/16.
 */
@Slf4j
public  abstract class CommonMsgEventHandler implements MsgEventHandler {

    public static final String PROCESSED = "Processed";

    @Autowired
    @Setter
    InboundMessagesRepository inboundMessagesRepository;


    public void postProcess(MsgMessage message, String response)
    {
        InboundMessages inboundMessages = new InboundMessages();
        inboundMessages.setGroupId(message.getGroupId());
        inboundMessages.setMessageId(message.getMessageId());
        inboundMessages.setPayload(message.getPayload());
        inboundMessages.setResponse(response);
        inboundMessagesRepository.save(inboundMessages);
    }

    public EventResponse preProcess(MsgMessage message)
    {
        String messageId= message.getMessageId();

        List<String> inboundMessagesList=inboundMessagesRepository.findByMessageId(messageId);
        if(inboundMessagesList.size()>0 && inboundMessagesList.get(0).equals(PROCESSED))
        {
            return new EventResponse(200,"Message already processed");
        }
        else return null;
    }

    public EventResponse invoke(MsgMessage message)
    {
        log.info("Received Message Id {}",message.getMessageId());
        EventResponse eventResponse=preProcess(message);
        if(eventResponse!=null)return eventResponse;

        String payload= message.getPayload();

        String response=PROCESSED;
        int status=200;
        try {
            response=handle(payload);
        }
        catch (Exception e)
        {
            response="Exception "+e.getStackTrace();
            status=500;
            log.error(ExceptionUtils.getMessage(e));
        }
        finally {
            postProcess(message,response);
            return new EventResponse(status,response);
        }
    }
}
