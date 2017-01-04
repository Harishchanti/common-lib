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

        //default profile qa
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
            rabbitMqHost="ac14beb47a59811e69f9602bdb402d33-896170883.ap-southeast-1.elb.amazonaws.com";
        }
        else if("development".equals(msgConfig.getEnv()))
        {
            rabbitMqHost="a08f6ca2fd25511e6bbba123cc1aef16-1127466792.us-east-1.elb.amazonaws.com";
            userName="guest";
            password="guest";
        }
        String CLUSTER_NAME="MSG";
        RabbitMqConnectionManager.setPoolType(PoolType.LAZY);
        RabbitMqConnectionManager.setPoolSize(poolSize);
        RabbitMqConnectionManager.createConnectionPool(CLUSTER_NAME,rabbitMqHost,userName,password);
        RabbitMqConnectionManager.setDefaultCluster(CLUSTER_NAME);
    }
}
