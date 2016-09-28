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
    final int retry=3;

    @Override
    public void setup() {
        Config config = new Config();
        config.getGroupConfig().setName(CLUSTERNAME);
        instance = Hazelcast.newHazelcastInstance(config);

        log.info("Hazelcast instance created {}", instance.getName());
    }

    @Override
    public void updateAvailbleQueue(String clientName, String str)
    {

        Map<String,Queue<String>>  map = instance.getMap(AVAILABLE_GROUP_MAP);
        map.get(clientName).add(str);
    }

    @Override
    public synchronized Optional<QueueInfo> findIdleQueue(String clientName)
    {

        Map<String,Queue<String>>  map = instance.getMap(AVAILABLE_GROUP_MAP);
        Queue<String> queue = map.get(clientName);
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
        stat.setWaitingGroups(instance.getMap(WAITING_GROUPS));

        stat.setQueueMap(instance.getMap(AVAILABLE_GROUP_MAP));
        return stat;
    }

    @Override
    public synchronized void updateSet(String setName, String ele) {
        Set<String> set = instance.getSet(setName);
        set.add(ele);
    }



    @Override
    public boolean isWaiting(String clientName, String groupId) {
        Map<String,Set<String>> map =instance.getMap(WAITING_GROUPS);

        return map.get(clientName)!=null && map.get(clientName).contains(groupId);
    }


    @Override
    public void clearWaitingList(String clientName) {
        instance.getMap(WAITING_GROUPS).remove(clientName);
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
                if (queueInfo.getRetry() >= retry) {
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



}
