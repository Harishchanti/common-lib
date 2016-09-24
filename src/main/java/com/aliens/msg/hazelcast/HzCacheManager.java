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

/**
 * Created by jayant on 25/9/16.
 */
@Component
@Getter
@Slf4j
@Singleton
public class HzCacheManager implements CacheManager {

    private static HazelcastInstance instance;

    public void setup()
    {
        Config config = new Config();
        config.getGroupConfig().setName("testCluster");
        instance = Hazelcast.newHazelcastInstance(config);

        log.info("Hazelcast instance created {}",instance.getName());
    }


    @Override
    public Optional<QueueInfo> findIdleQueue() {
        Map<String, QueueInfo> dataMap = instance.getMap("data");

        Optional<QueueInfo> queueDataOptional=dataMap.values().stream()
            .filter(queueInfo -> queueInfo.getState().equals(QueueState.IDLE))
            .findFirst();

        return queueDataOptional;
    }

    @Override
    public void updateData(QueueInfo queueInfo, ChannelResponse response) {

        Map<String, QueueInfo> dataMap = instance.getMap("data");
        String key= queueInfo.getGroupName();

        if(response==ChannelResponse.QUEUE_PROCESSED)
        {

            log.info("Deleting entry {}",key);
            dataMap.remove(key);
        }
        else if(response==ChannelResponse.MESSAGE_FAILED)
        {
            if(queueInfo.getRetry()>=3)
            {
                queueInfo.setState(QueueState.FAILED);
            }
            else queueInfo.incRetry(1);

             dataMap.put(key, queueInfo);
        }
        else if(response==ChannelResponse.ERROR)
        {
            queueInfo.setState(QueueState.IDLE);
            dataMap.put(key, queueInfo);
        }


    }

    @Override
    public void updateData(QueueInfo queueInfo, QueueState queueState) {
        Map<String, QueueInfo> dataMap = instance.getMap("data");
        String key= queueInfo.getGroupName();
        queueInfo.setState(queueState);
        dataMap.put(key, queueInfo);
    }
}
