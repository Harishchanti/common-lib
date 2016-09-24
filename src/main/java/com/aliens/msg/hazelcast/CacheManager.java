package com.aliens.msg.hazelcast;

import com.aliens.msg.mmq.ChannelResponse;

import java.util.Optional;

/**
 * Created by jayant on 25/9/16.
 */
public interface CacheManager {

    public Optional<QueueInfo> findIdleQueue();

    public void updateData(QueueInfo queueInfo, ChannelResponse response);

    public void updateData(QueueInfo queueInfo, QueueState queueState);
}
