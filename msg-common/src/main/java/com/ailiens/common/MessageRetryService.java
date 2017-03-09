package com.ailiens.common;

import java.util.List;

/**
 * Created by jayant on 12/2/17.
 */
public interface MessageRetryService<T> {
    List<T> getFailedMessages(int pageSize);
    void incRetry(T object);
    void setDelivered(T object);
}
