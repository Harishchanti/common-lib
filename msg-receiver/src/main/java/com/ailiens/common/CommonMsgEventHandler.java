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
    InboundLoggingService inboundLoggingService;


    @Override
    public void postProcess(MsgMessage message, String response,String handlerResponse)
    {
       inboundLoggingService.save(message,response,handlerResponse);
    }

    public EventResponse preProcess(MsgMessage message)
    {
        String messageId= message.getMessageId();

        List<String> inboundMessagesList=inboundLoggingService.findByMessageId(messageId);
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
        String handlerResponse="";
        int status=200;
        try {
            handlerResponse=handle(payload);
        }
        catch (Exception e)
        {
            handlerResponse=response=ExceptionUtils.getMessage(e);
            status=500;
            log.error(handlerResponse);
        }
        finally {
            postProcess(message,response,handlerResponse);
            return new EventResponse(status,handlerResponse);
        }
    }
}
