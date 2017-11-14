package com.ailiens.common;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeoutException;

/**
 * Created by jayant on 15/11/16.
 */
@Slf4j
@Component
@Singleton
public class MsgConnectionManager {

    @Autowired
    MsgConfig msgConfig;

    HashMap<String,RabbitmqConfig> configHashMap =  new HashMap<>();

    @PostConstruct
    public void init()
    {
        configHashMap.put("qa-kube",RabbitmqConfig.builder().host("ac521f15ea4b211e69b1f1283e06dba7-1417201917.us-east-1.elb.amazonaws.com").build());

        configHashMap.put("qa-default",RabbitmqConfig.builder()
            .host("msg-rabbitmq-qa.ailiens.com")
            .userName("msg")
            .password("msg")
            .build());

        configHashMap.put("dev-default",RabbitmqConfig.builder().host("a08f6ca2fd25511e6bbba123cc1aef16-1127466792.us-east-1.elb.amazonaws.com").build());


        configHashMap.put("prod-kube",RabbitmqConfig.builder()
            .host("ac14beb47a59811e69f9602bdb402d33-896170883.ap-southeast-1.elb.amazonaws.com")
            .userName("guest")
            .password("guest")
            .build());

        configHashMap.put("prod-default",RabbitmqConfig.builder()
            .host("ec2-52-221-72-59.ap-southeast-1.compute.amazonaws.com")
            .userName("guest")
            .password("guest")
            .build());

        configHashMap.put("prod-cluster2",RabbitmqConfig.builder()
            .host("172.31.17.170")
            .userName("pcm")
            .password("pcm@admin_AKDDH")
            .build());

        configHashMap.put("prod-mumbai1",RabbitmqConfig.builder()
            .host("13.126.167.18")
            .userName("guest")
            .password("guest")
            .build());

        configHashMap.put("prod-mumbai2",RabbitmqConfig.builder()
            .host("10.60.9.164")
            .userName("guest")
            .password("guest")
            .build());
    }


    @PostConstruct
    public void setup() throws IOException, TimeoutException {

        int poolSize=msgConfig.getPoolSize();
        if(poolSize==0)poolSize=1;

        String rabbitMqHost="";
        String userName="";
        String password="";

        String env= msgConfig.getEnv();
        String cluster= msgConfig.getCluster();
        String poolType=msgConfig.getPoolType();

        Preconditions.checkNotNull(env);

        log.info("Msg Env {} ,cluster {} ,poolSize {} ,poolType {}" ,env,cluster,poolSize,poolType);


        if(env.equals("local"))
        {
            rabbitMqHost="localhost";
            userName=msgConfig.getUserName();
            password=msgConfig.getPassword();
        }

        else {

            if (Strings.isNullOrEmpty(cluster))
                cluster = "default";

            String key = String.format("%s-%s", env, cluster);

            if (!configHashMap.containsKey(key))
                throw new RuntimeException("No config for key " + key);

            RabbitmqConfig rabbitmqConfig = configHashMap.get(key);

               rabbitMqHost= MoreObjects.firstNonNull(msgConfig.getHost(),rabbitmqConfig.getHost());
               userName=MoreObjects.firstNonNull(msgConfig.getUserName(),rabbitmqConfig.getUserName());
               password =MoreObjects.firstNonNull(msgConfig.getPassword(),rabbitmqConfig.getPassword());

        }

        log.info(" {} {} {}",rabbitMqHost,userName,password);

        String CLUSTER_NAME="MSG";
        if(Strings.isNullOrEmpty(poolType))
        {
            RabbitMqConnectionManager.setPoolType(PoolType.LAZY);
        }
        else
        {
            RabbitMqConnectionManager.setPoolType(PoolType.valueOf(poolType));
        }
        RabbitMqConnectionManager.setPoolSize(poolSize);
        RabbitMqConnectionManager.createConnectionPool(CLUSTER_NAME,rabbitMqHost,userName,password);
        RabbitMqConnectionManager.setDefaultCluster(CLUSTER_NAME);
    }
}
