package com.ailiens.common;

/**
 * Created by jayant on 12/2/17.
 */
public interface MessageLoggingService {
    void save(MsgMessage message, String topic);

    void saveUndiveleredMessage(MsgMessage message, String topic, String exceptionMessage);
}
