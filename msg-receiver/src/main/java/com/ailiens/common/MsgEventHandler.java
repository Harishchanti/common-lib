package com.ailiens.common;

/**
 * Created by jayant on 19/11/16.
 */


public interface MsgEventHandler extends MsgHandler {

    String handle(String payload) throws Exception;

    EventResponse invoke(MsgMessage message);
}
