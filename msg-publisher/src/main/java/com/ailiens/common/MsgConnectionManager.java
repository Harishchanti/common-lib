package com.ailiens.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.io.IOException;
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


    @PostConstruct
    public void setup() throws IOException, TimeoutException {

        int poolSize=msgConfig.getPoolSize();
        if(poolSize==0)poolSize=1;

        String rabbitMqHost="ac521f15ea4b211e69b1f1283e06dba7-1417201917.us-east-1.elb.amazonaws.com";
        String userName="";
        String password="";

        if("local".equals(msgConfig.getEnv()) )
        {
            rabbitMqHost="localhost";
            userName=msgConfig.getUserName();
            password=msgConfig.getPassword();
        }
        else if("prod".equals(msgConfig.getEnv()) )
        {
            //:TODO  put MSG prod settings here

        }
        String CLUSTER_NAME="MSG";
        RabbitMqConnectionManager.setPoolType(PoolType.EAGER);
        RabbitMqConnectionManager.setPoolSize(poolSize);
        RabbitMqConnectionManager.createConnectionPool(CLUSTER_NAME,rabbitMqHost,userName,password);
        RabbitMqConnectionManager.setDefaultCluster(CLUSTER_NAME);
    }
}
