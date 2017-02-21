package com.ailiens.common;

import java.util.List;

/**
 * Created by jayant on 20/2/17.
 */
public interface InboundLoggingService {

    List<String> findByMessageId(String messageId);

    void save(MsgMessage msgMessage,String response,String handlerResponse);
}
