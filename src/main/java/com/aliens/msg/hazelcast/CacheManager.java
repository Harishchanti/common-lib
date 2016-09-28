package com.aliens.msg.hazelcast;

import com.aliens.msg.mmq.ChannelResponse;

import java.util.Optional;

/**
 * Created by jayant on 25/9/16.
 */
public interface CacheManager<T> {


    void updateAvailbleQueue(String clientName, String str);

    Optional<QueueInfo> findIdleQueue(String clientName);

    HzStat getStat();

    void updateSet(String setName, String ele);



    void setup();


    void putToWait(String clientName, String ele);

    boolean isWaiting(String clientName, String groupId);

    void clearWaitingList(String clientName);

    Optional<T> findByGroupId(String groupId);

    int getSize();

    void updateData(T queueInfo, ChannelResponse response);

    void updateData(T queueInfo, QueueState queueState);
}
