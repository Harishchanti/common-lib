package com.ailiens.common;

import java.util.Collections;
import java.util.List;

/**
 * Created by jayant on 12/2/17.
 */
public interface MessageLoggingService {
    void save(MsgMessage message, String topic);

    default void saveUndiveleredMessage(MsgMessage message, String topic, String exceptionMessage) {}

    default List<? extends MsgOutbound> search(String messageId)
    {
        return Collections.emptyList();
    }
}
