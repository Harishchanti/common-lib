package com.ailiens.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

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

    public MsgConnectionManager()  {
        try {
            setup();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public static void setup() throws IOException, TimeoutException {
        String CLUSTER_NAME="MSG";
        String rabbitMqHost="ac521f15ea4b211e69b1f1283e06dba7-1417201917.us-east-1.elb.amazonaws.com";
        RabbitMqConnectionManager.setPoolType(PoolType.EAGER);
        RabbitMqConnectionManager.setPoolSize(1);
        RabbitMqConnectionManager.createConnectionPool(CLUSTER_NAME,rabbitMqHost,"","");

        RabbitMqConnectionManager.setDefaultCluster(CLUSTER_NAME);
    }
}