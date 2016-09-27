package com.aliens.msg.hazelcast;

import com.aliens.msg.mmq.ChannelResponse;

import java.util.Optional;

/**
 * Created by jayant on 25/9/16.
 */
public interface CacheManager<T> {


    HzStat getStat();

    void updateSet(String setName, String ele);

    boolean isWaiting(String groupId);

    void clearWaitingList();

    void setup();

    void updateAvailbleQueue(String str);

    Optional<T> findIdleQueue();

    Optional<T> findByGroupId(String groupId);

    int getSize();

    void updateData(T queueInfo, ChannelResponse response);

    void updateData(T queueInfo, QueueState queueState);
}
