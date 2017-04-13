package com.ailiens.common;

import java.util.List;

/**
 * Created by jayant on 19/11/16.
 */
public interface MsgBulkEventHandler  extends MsgHandler{

    EventResponse invoke(List<MsgMessage> messageList);
}
