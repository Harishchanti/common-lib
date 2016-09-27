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
import java.util.Queue;
import java.util.Set;

import static com.aliens.msg.hazelcast.Constants.*;

/**
 * Created by jayant on 25/9/16.
 */
@Component
@Getter
@Slf4j
@Singleton
public class HzCacheManager implements CacheManager<QueueInfo> {


    private HazelcastInstance instance;

    @Override
    public void setup() {
        Config config = new Config();
        config.getGroupConfig().setName(CLUSTERNAME);
        instance = Hazelcast.newHazelcastInstance(config);

        log.info("Hazelcast instance created {}", instance.getName());
    }

    @Override
    public void updateAvailbleQueue(String str)
    {
        instance.getQueue(AVAILABLE_GROUP_QUEUE).add(str);
    }

    @Override
    public synchronized Optional<QueueInfo> findIdleQueue()
    {
        Queue<String> queue = instance.getQueue(AVAILABLE_GROUP_QUEUE);
        if(queue.isEmpty())
        {
            return Optional.empty();
        }

        String groupId=queue.poll();
        Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
        return Optional.ofNullable(dataMap.getOrDefault(groupId,null));
    }

    @Override
    public HzStat getStat()
    {
        HzStat stat = new HzStat();
        stat.setMainQueueworkerThreads(instance.getSet(MAIN_QUEUE_WORKER_LIST));
        stat.setGroupQueueWorkerThreads(instance.getSet(GROUP_QUEUE_WORKER_LIST));
        stat.setRestartedThreads(instance.getSet(RESTARTED_WORKER_LIST));
        stat.setMappings(instance.getMap(QUEUE_MAPPINGS));
        stat.setInfo(instance.getMap(INFO));
        stat.setWaitingGroupList(instance.getSet(WAITING_GROUPS_LIST));

        stat.setQueue(instance.getQueue(AVAILABLE_GROUP_QUEUE));
        return stat;
    }

    @Override
    public synchronized void updateSet(String setName, String ele) {
        Set<String> set = instance.getSet(setName);
        set.add(ele);
    }



    @Override
    public boolean isWaiting(String groupId) {
        Set<String> waiting = instance.getSet(WAITING_GROUPS_LIST);
        return waiting.contains(groupId);
    }


    @Override
    public void clearWaitingList() {
        Set<String> waiting = instance.getSet(WAITING_GROUPS_LIST);
        waiting.clear();
    }


    @Override
    public Optional<QueueInfo> findByGroupId(String groupId) {
        Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
        return Optional.ofNullable(dataMap.getOrDefault(groupId, null));
    }

    @Override
    public synchronized  int getSize() {
        Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
        return dataMap.size();
    }

    @Override
    public synchronized void updateData(QueueInfo queueInfo, ChannelResponse response) {

        //synchronized (queueInfo.getGroupName())
        {
            Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
            String key = queueInfo.getGroupName();

            if (response == ChannelResponse.QUEUE_PROCESSED) {

                log.info("Deleting entry {}", key);
                dataMap.remove(key);
            } else if (response == ChannelResponse.MESSAGE_FAILED) {
                queueInfo.incRetry(1);
                if (queueInfo.getRetry() >= 3) {
                    queueInfo.setState(QueueState.FAILED);
                } else {

                    queueInfo.setState(QueueState.IDLE);
                }

                dataMap.put(key, queueInfo);
            } else if (response == ChannelResponse.ERROR) {
                queueInfo.setState(QueueState.IDLE);
                dataMap.put(key, queueInfo);
            }
        }


    }

    @Override
    public  synchronized void updateData(QueueInfo queueInfo, QueueState queueState) {
        //synchronized (queueInfo.getGroupName())
        {
            Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
            String key = queueInfo.getGroupName();
            queueInfo.setState(queueState);
            dataMap.put(key, queueInfo);
        }
    }


    //deprecated methods

    @Deprecated
    public void handleRestart() {
        Set<String> workerThreads = instance.getSet(MAIN_QUEUE_WORKER_LIST);
        Set<String> restartedThreads = instance.getSet(RESTARTED_WORKER_LIST);
        restartedThreads.clear();
        Map<String, Integer> dataMap = instance.getMap(INFO);
        dataMap.put(RESTART_STATE, workerThreads.size());

    }

    @Deprecated
    public Integer getRestartState() {
        Map<String, Integer> dataMap = instance.getMap(INFO);
        return dataMap.getOrDefault(RESTART_STATE, 0);
    }

    public void decreaseRestartState() {
        Map<String, Integer> dataMap = instance.getMap(INFO);
        int prevstate = dataMap.getOrDefault(RESTART_STATE, 0);
        dataMap.put(RESTART_STATE, prevstate - 1);
    }

    public boolean isRestarted(String threadName) {
        Set<String> set = instance.getSet(RESTARTED_WORKER_LIST);
        return set.contains(threadName);
    }
}
