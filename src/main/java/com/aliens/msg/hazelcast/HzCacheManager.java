package com.aliens.msg.hazelcast;

import com.aliens.msg.init.BootStrap;
import com.aliens.msg.mmq.ChannelResponse;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.inject.Singleton;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.aliens.msg.Constants.*;

/**
 * Created by jayant on 25/9/16.
 */
@Component
@Getter
@Slf4j
@Singleton
public class HzCacheManager implements BootStrap,CacheManager<QueueInfo> {


    final int retry = 5;
    final int workerStatusTTL=2;

    private HazelcastInstance instance;

    @Override
    public void setup() {
        Config config = new Config();
        config.getGroupConfig().setName(CLUSTERNAME);
        instance = Hazelcast.newHazelcastInstance(config);

        log.info("Hazelcast instance created {}", instance.getName());
    }

    @Override
    public synchronized void updateAvailbleQueue(String clientName, String str) {
        String queueName = clientName + AVAILABLE_GROUP_SUFFIX;
        instance.getQueue(queueName).add(str);

    }

    @Override
    public synchronized Optional<QueueInfo> findIdleQueue(String clientName) {

        String queueName = clientName + AVAILABLE_GROUP_SUFFIX;
        Queue<String> queue = instance.getQueue(queueName);
        if (queue == null || queue.isEmpty()) {
            return Optional.empty();
        }

        String groupId = queue.poll();
        Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
        return Optional.ofNullable(dataMap.getOrDefault(groupId, null));
    }

    @Override
    public HzStat getStat() {
        HzStat stat = new HzStat();
        stat.setClients(instance.getSet(CLIENTS));
        stat.setMainQueueworkerThreads(instance.getSet(MAIN_QUEUE_WORKER_LIST));
        stat.setGroupQueueWorkerThreads(instance.getSet(GROUP_QUEUE_WORKER_LIST));
        stat.setRestartedThreads(instance.getSet(RESTARTED_WORKER_LIST));
        stat.setMappings(instance.getMap(QUEUE_MAPPINGS));
        stat.setWorkerStatus(instance.getMap(WORKER_STATUS));

        Set<String> clients = instance.getSet(CLIENTS);
        for (String client : clients) {
            Queue<String> st = instance.getQueue(client + AVAILABLE_GROUP_SUFFIX);
            stat.getQueue().put(client, st);
            stat.getWaitingGroups().put(client, instance.getSet(client + WAITING_GROUP_SUFFIX));
        }

        return stat;
    }

    @Override
    public boolean isWorkerRequired(String clientName)
    {
        IMap<String,String> info =instance.getMap(WORKER_STATUS);
        if(info.containsKey(clientName))return  false;
        info.put(clientName,WORKER_ACTIVE,workerStatusTTL, TimeUnit.MINUTES);
        return true;
    }

    @Override
    public void updateWorkerStatus(String clientName,String status)
    {
        IMap<String,String> info =instance.getMap(WORKER_STATUS);
        info.put(clientName,status,workerStatusTTL, TimeUnit.MINUTES);
    }

    @Override
    public synchronized void addToSet(String setName, String ele) {
        Set<String> set = instance.getSet(setName);
        set.add(ele);
    }

    @Override
    public synchronized void removeFromSet(String setName, String ele) {
        Set<String> set = instance.getSet(setName);
        set.remove(ele);
    }

    @Override
    public void putToWait(String clientName, String ele) {
        instance.getSet(clientName + WAITING_GROUP_SUFFIX).add(ele);
    }


    @Override
    public boolean isWaiting(String clientName, String groupId) {
        return instance.getSet(clientName + WAITING_GROUP_SUFFIX).contains(groupId);
    }


    @Override
    public void clearWaitingList(String clientName) {
        instance.getSet(clientName + WAITING_GROUP_SUFFIX).clear();
    }


    @Override
    public Optional<QueueInfo> findByGroupId(String groupId) {
        Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
        return Optional.ofNullable(dataMap.getOrDefault(groupId, null));
    }

    @Override
    public synchronized int getSize() {
        Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
        return dataMap.size();
    }

    @Override
    public void deleteKey(String key)
    {
        IMap<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
        dataMap.remove(key);
    }

    @Override
    public synchronized void updateData(QueueInfo queueInfo, ChannelResponse response) {

        //synchronized (queueInfo.getGroupName())
        {
            IMap<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
            String key = queueInfo.getGroupName();

            switch (response) {
                case QUEUE_PROCESSED:
                    log.info("Deleting entry {}", key);
                    dataMap.remove(key);
                    break;

                case MESSAGE_FAILED:
                    queueInfo.incRetry(1);
                    if (queueInfo.getRetry() >= retry) {
                        queueInfo.setState(QueueState.FAILED);
                    } else {

                        queueInfo.setState(QueueState.IDLE);
                        updateAvailbleQueue(queueInfo.getClientName(),queueInfo.getGroupName());
                    }

                    dataMap.put(key, queueInfo);
                    break;

                case ERROR:
                case NOT_ENOUGH_MESSAGES:
                    updateAvailbleQueue(queueInfo.getClientName(),queueInfo.getGroupName());
                    queueInfo.setState(QueueState.IDLE);
                    queueInfo.incRetry(1);
                    dataMap.put(key, queueInfo);
            }
        }


    }

    @Override
    public synchronized void updateData(QueueInfo queueInfo, QueueState queueState) {
        //synchronized (queueInfo.getGroupName())
        {
            Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
            String key = queueInfo.getGroupName();
            queueInfo.setState(queueState);
            dataMap.put(key, queueInfo);
        }
    }

    @Override
    public void resetQueue(String groupId,QueueState queueState){

    	Map<String, QueueInfo> dataMap = instance.getMap(QUEUE_MAPPINGS);
    	QueueInfo queueInfo = dataMap.getOrDefault(groupId, null);
    	if(queueInfo != null){
    		queueInfo.setState(queueState);
        	queueInfo.setRetry(0);
        	dataMap.put(groupId, queueInfo);
    	}
    	updateAvailbleQueue(queueInfo.getClientName(),groupId);
    }



}
