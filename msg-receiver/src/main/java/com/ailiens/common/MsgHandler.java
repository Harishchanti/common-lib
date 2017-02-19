package com.ailiens.common;

/**
 * Created by jayant on 20/2/17.
 */
public interface MsgHandler {

    String getEventType();
    void postProcess(MsgMessage message, String response,String handlerResponse);
}
