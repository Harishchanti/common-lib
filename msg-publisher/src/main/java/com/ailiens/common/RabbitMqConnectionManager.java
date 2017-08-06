package com.ailiens.common;

import com.google.common.base.Strings;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.Synchronized;
import lombok.experimental.FieldDefaults;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/**
 * Created by jayant on 11/10/16.
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RabbitMqConnectionManager {

    static Map<String,ConnectionFactoryProxy> map = new HashMap<>();

    @Setter
    static String defaultCluster;

    @Setter
    static int poolSize=5;

    @Setter
    static PoolType poolType=PoolType.EAGER;

    public static void createConnectionPool(String clusterName,String host,String username,String password) throws IOException, TimeoutException {
        if(!map.containsKey(clusterName))
        {
            map.put(clusterName,new ConnectionFactoryProxy(host, username, password,poolSize,poolType));
        }
    }


    public static Connection getConnection(String name) throws Exception {
        if(Strings.isNullOrEmpty(name))return getConnection();
        return map.get(name).getConnection();
    }



    public static Connection getConnection() throws Exception {
        if(Strings.isNullOrEmpty(defaultCluster))
        {
            if(map.size()==1) {
                Collection<ConnectionFactoryProxy> connectionFactoryProxies= map.values();

                for(ConnectionFactoryProxy proxy: connectionFactoryProxies)
                    return proxy.getConnection();

            }
            throw new Exception("Default cluster not set");
        }
        return map.get(defaultCluster).getConnection();
    }

    @Synchronized
    public static Channel getChannel(String name) throws Exception {
        if(Strings.isNullOrEmpty(name))return getChannel();
        return map.get(name).getChannel();
    }

    @Synchronized
    public static Channel getChannel() throws Exception {
        if(Strings.isNullOrEmpty(defaultCluster))
        {
            if(map.size()==1) {
                Collection<ConnectionFactoryProxy> connectionFactoryProxies= map.values();

                for(ConnectionFactoryProxy proxy: connectionFactoryProxies)
                    return proxy.getChannel();

            }
            throw new Exception("Default cluster not set");
        }
        return map.get(defaultCluster).getChannel();
    }



    public static void destroy() throws IOException {
        for(ConnectionFactoryProxy proxy: map.values())
            proxy.destroy();
    }
}
