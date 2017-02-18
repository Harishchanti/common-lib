package com.ailiens.common;

/**
 * Created by jayant on 19/11/16.
 */


public interface MsgEventHandler {

    String getEventType();
    String handle(String payload) throws Exception;

    void postProcess(MsgMessage message, String response,String handlerResponse);

    EventResponse invoke(MsgMessage message);
}
