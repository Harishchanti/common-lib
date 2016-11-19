package com.ailiens.common;

import java.util.List;

/**
 * Created by jayant on 19/11/16.
 */
public interface MsgBulkEventHandler {

    String getEventType();

    void postProcess(MsgMessage message, String response);

    EventResponse invoke(List<MsgMessage> messageList);
}
