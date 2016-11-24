package com.ailiens.common;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by jayant on 19/11/16.
 */

@Component
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MsgBaseEventHandler {

    @Autowired(required = false)
    List<MsgEventHandler> msgEventHandlers;

    @Autowired(required = false)
    List<MsgBulkEventHandler> msgBulkEventHandlerList;

    Map<String,MsgEventHandler> handlerMap = new HashMap<>();
    Map<String,MsgBulkEventHandler> bulkEventHandlerMap = new HashMap<>();

    @PostConstruct
    public void setup()
    {
        log.info("Constructing EventHandler map");
        if(msgEventHandlers!=null)
        {
            handlerMap =msgEventHandlers.stream().collect(Collectors.toMap(MsgEventHandler::getEventType, Function.identity()));
        }
        if(msgBulkEventHandlerList!=null)
        {
            bulkEventHandlerMap =msgBulkEventHandlerList.stream().collect(Collectors.toMap(MsgBulkEventHandler::getEventType, Function.identity()));
        }
    }

    public EventResponse handle(MsgMessage msgMessage)
    {
        String eventType=msgMessage.getEventType();
        if(eventType==null)eventType="";
        if(handlerMap.containsKey(eventType))
        {
            return handlerMap.get(eventType).invoke(msgMessage);
        }
        else return new EventResponse(200,"No handlers found for eventType "+eventType);
    }

    public EventResponse handle(List<MsgMessage> msgMessageList)
    {
        String eventType=msgMessageList.get(0).getEventType();
        if(bulkEventHandlerMap.containsKey(eventType))
        {
            return bulkEventHandlerMap.get(eventType).invoke(msgMessageList);
        }
        else return new EventResponse(200,"No handlers found for eventType "+eventType);
    }
}
