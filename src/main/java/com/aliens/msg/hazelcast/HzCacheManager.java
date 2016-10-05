package com.aliens.msg.hazelcast;

import com.aliens.hipster.config.JHipsterProperties;
import com.aliens.msg.config.HazelcastConfig;
import com.aliens.msg.init.BootStrap;
import com.aliens.msg.mmq.ChannelResponse;
import com.hazelcast.config.*;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
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

    @Inject
    HazelcastConfig hazelcastConfig;

    @Override
    public void setup() {
        Config config = getConfig();
        config.getGroupConfig().setName(CLUSTERNAME);
        instance = Hazelcast.newHazelcastInstance(config);

        log.info("Hazelcast instance created {}", instance.getName());
    }

    public Config getConfig() {
        log.debug("Configuring Hazelcast");
        Config config = new Config();
        config.setInstanceName("msg");
        config.getNetworkConfig().setPort(5701);
        config.getNetworkConfig().setPortAutoIncrement(true);

        // In development, remove multicast auto-configuration
        if (hazelcastConfig.isAws()) {
            config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
            config.getNetworkConfig().getJoin().getTcpIpConfig().setEnabled(false);
            AwsConfig awsCondif = config.getNetworkConfig().getJoin().getAwsConfig();
            awsCondif.setEnabled(true);
            awsCondif.setAccessKey(hazelcastConfig.getAccessKey());
            awsCondif.setSecretKey(hazelcastConfig.getSecretKey());
            awsCondif.setRegion(hazelcastConfig.getRegionCode());
            // awsCondif.setHostHeader(hostHeader);
            awsCondif.setSecurityGroupName(hazelcastConfig.getSecurityGroup());
            awsCondif.setTagKey(hazelcastConfig.getTagKey());
            awsCondif.setTagValue(hazelcastConfig.getTagValue());
        } else {
            System.setProperty("hazelcast.local.localAddress", "127.0.0.1");
            config.getNetworkConfig().getJoin().getAwsConfig().setEnabled(false);
            config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
            config.getNetworkConfig().getJoin().getTcpIpConfig().setEnabled(false);
        }

        config.getMapConfigs().put("default", initializeDefaultMapConfig());
        //config.getMapConfigs().put("com.aliens.msg.models.*", initializeDomainMapConfig(jHipsterProperties));

        return config;
    }

    private MapConfig initializeDefaultMapConfig() {
        MapConfig mapConfig = new MapConfig();

        /*
            Number of backups. If 1 is set as the backup-count for example,
            then all entries of the map will be copied to another JVM for
            fail-safety. Valid numbers are 0 (no backup), 1, 2, 3.
         */
        mapConfig.setBackupCount(0);

        /*
            Valid values are:
            NONE (no eviction),
            LRU (Least Recently Used),
            LFU (Least Frequently Used).
            NONE is the default.
         */
        mapConfig.setEvictionPolicy(EvictionPolicy.NONE);

        /*
            Maximum size of the map. When max size is reached,
            map is evicted based on the policy defined.
            Any integer between 0 and Integer.MAX_VALUE. 0 means
            Integer.MAX_VALUE. Default is 0.
         */
        mapConfig.setMaxSizeConfig(new MaxSizeConfig(0, MaxSizeConfig.MaxSizePolicy.USED_HEAP_SIZE));

        /*
            When max. size is reached, specified percentage of
            the map will be evicted. Any integer between 0 and 100.
            If 25 is set for example, 25% of the entries will
            get evicted.
         */
        mapConfig.setEvictionPercentage(25);

        return mapConfig;
    }

    private MapConfig initializeDomainMapConfig(JHipsterProperties jHipsterProperties) {
        MapConfig mapConfig = new MapConfig();

        //mapConfig.setTimeToLiveSeconds(jHipsterProperties.getCache().getTimeToLiveSeconds());
        return mapConfig;
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
