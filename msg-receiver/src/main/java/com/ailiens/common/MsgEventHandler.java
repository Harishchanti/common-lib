package com.ailiens.common;

/**
 * Created by jayant on 19/11/16.
 */


public interface MsgEventHandler extends MsgHandler {

    default String handle(String payload) throws Exception {return null;}

    default String handle(MsgMessage message) throws Exception {return handle(message.getPayload());}

    EventResponse invoke(MsgMessage message);


}
