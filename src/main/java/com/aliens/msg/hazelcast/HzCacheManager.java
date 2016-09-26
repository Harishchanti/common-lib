package com.aliens.msg.hazelcast;

import com.aliens.msg.mmq.ChannelResponse;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.inject.Singleton;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Created by jayant on 25/9/16.
 */
@Component
@Getter
@Slf4j
@Singleton
public class HzCacheManager implements CacheManager {


    public final static String CLUSTERNAME = "testCluster";

    public final static String MAIN_QUEUE_WORKER_LIST = "mainQueueWorkerThreads";
    public final static String GROUP_QUEUE_WORKER_LIST = "groupQueueWorkerThreads";

    public final static String RESTARTED_WORKER_LIST = "restartedThreads";
    public final static String WAITING_GROUPS_LIST="waitingGroups";
    public final static String QUEUE_MAPPINGS="data";
    public final static String INFO="info";
    public final static String RESTART_STATE="restartState";

    private HazelcastInstance instance;

    public void setup() {
        Config config = new Config();
        config.getGroupConfig().setName(CLUSTERNAME);
        instance = Hazelcast.newHazelcastInstance(config);

        log.info("Hazelcast instance created {}", instance.getName());
    }

    public HzStat getStat()
    {
        HzStat stat = new HzStat();
         stat.setMainQueueworkerThreads(instance.getSet(MAIN_QUEUE_WORKER_LIST));
         stat.setGroupQueueWorkerThreads(instance.getSet(GROUP_QUEUE_WORKER_LIST));
        stat.setRestartedThreads(instance.getSet(RESTARTED_WORKER_LIST));
        stat.setMappings(instance.getMap(QUEUE_MAPPINGS));
        stat.setInfo(instance.getMap(INFO));
        stat.setWaitingGroupList(instance.getSet(WAITING_GROUPS_LIST));
        return stat;
    }


    public void updateSet(String setName, String ele) {
        Set<String> set = instance.getSet(setName);
        set.add(ele);
    }

    public synchronized void handleRestart() {
        Set<String> workerThreads = instance.getSet(MAIN_QUEUE_WORKER_LIST);
        Set<String> restartedThreads = instance.getSet(RESTARTED_WORKER_LIST);
        restartedThreads.clear();
        Map<String, Integer> dataMap = instance.getMap(INFO);
        dataMap.put(RESTART_STATE, workerThreads.size());

    }

    public Integer getRestartState() {
        Map<String, Integer> dataMap = instance.getMap(INFO);
        return dataMap.getOrDefault(RESTART_STATE, 0);
    }

    public void decreaseRestartState() {
        Map<String, Integer> dataMap = instance.getMap(INFO);
        int prevstate = dataMap.getOrDefault(RESTART_STATE, 0);
        dataMap.put(RESTART_STATE, prevstate - 1);
    }

    @Override
    public boolean isWaiting(String groupId) {
        Set<String> waiting = instance.getSet(WAITING_GROUPS_LIST);
        return waiting.contains(groupId);
    }

    public boolean isRestarted(String threadName) {
        Set<String> set = instance.getSet(RESTARTED_WORKER_LIST);
        return set.contains(threadName);
    }

    @Override
    public void clearWaitingList() {
        Set<String> waiting = instance.getSet(WAITING_GROUPS_LIST);
        waiting.clear();
    }

    @Override
    public synchronized Optional<QueueInfo> findIdleQueue() {
        Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);

        Optional<QueueInfo> queueDataOptional = dataMap.values().stream()
            .filter(queueInfo -> queueInfo.getState().equals(QueueState.IDLE))
            .findFirst();

        return queueDataOptional;
    }

    @Override
    public Optional<QueueInfo> findByGroupId(String groupId) {
        Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
        return Optional.ofNullable(dataMap.getOrDefault(groupId, null));
    }

    @Override
    public int getSize() {
        Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
        return dataMap.size();
    }

    @Override
    public void updateData(QueueInfo queueInfo, ChannelResponse response) {

        Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
        String key = queueInfo.getGroupName();

        if (response == ChannelResponse.QUEUE_PROCESSED) {

            log.info("Deleting entry {}", key);
            dataMap.remove(key);
        } else if (response == ChannelResponse.MESSAGE_FAILED) {
            if (queueInfo.getRetry() >= 3) {
                queueInfo.setState(QueueState.FAILED);
            } else queueInfo.incRetry(1);

            dataMap.put(key, queueInfo);
        } else if (response == ChannelResponse.ERROR) {
            queueInfo.setState(QueueState.IDLE);
            dataMap.put(key, queueInfo);
        }


    }

    @Override
    public void updateData(QueueInfo queueInfo, QueueState queueState) {
        Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
        String key = queueInfo.getGroupName();
        queueInfo.setState(queueState);
        dataMap.put(key, queueInfo);
    }
}
