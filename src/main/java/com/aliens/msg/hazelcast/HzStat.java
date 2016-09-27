package com.aliens.msg.hazelcast;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Created by jayant on 25/9/16.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HzStat {

    Set<String> mainQueueworkerThreads;
    Set<String> groupQueueWorkerThreads;

    Set<String> restartedThreads;
    Set<String> waitingGroupList;
    Queue<String> queue;
    Map<String, Integer> info;
    Map<String, QueueInfo> mappings;


}
