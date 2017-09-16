package com.ailiens.common;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;
import javax.annotation.PreDestroy;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 28/9/16.
 */
@Component
@Slf4j
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConnectionFactoryProxy   {

    ConnectionFactory factory = new ConnectionFactory();

    String host;
    String userName;
    String password;
    int poolSize;
    PoolType poolType;

    List<Connection> pool = Lists.newArrayList();
    int ptr;



    public ConnectionFactoryProxy(String host,String username,String password,int poolSize,PoolType poolType) throws IOException, TimeoutException {
        this.host=host;
        this.userName=username;
        this.password=password;
        this.poolSize=poolSize;
        this.poolType =poolType;
        this.ptr=0;
        setup();
    }




    public Connection getConnection() throws Exception
    {
        if(ptr> pool.size()-1)addConnectionToPool();

        Connection connection= pool.get(ptr);

        ptr=(ptr+1)%poolSize;
        return connection;
    }


    public Channel getChannel() throws Exception
    {
        return getConnection().createChannel();
    }

    public void addConnectionToPool() throws IOException, TimeoutException {
        log.info("Creating connection");
        pool.add(factory.newConnection());
        log.info("Connection created");
    }

    public  void setup() throws IOException, TimeoutException {
        factory.setHost(host);
        factory.setAutomaticRecoveryEnabled(true);
        factory.setConnectionTimeout(10000);

        if(!Strings.isNullOrEmpty(userName))
        factory.setUsername(userName);

        if(!Strings.isNullOrEmpty(password))
        factory.setPassword(password);

        log.info("Factory set up");

        switch (poolType) {
            case EAGER:
            for (int i = 0; i < poolSize; i++)
                addConnectionToPool();

            log.info("Connection pool created");
        }
    }

    @PreDestroy
    public void destroy() throws IOException {
        log.info("Closing Connections");
        for(Connection connection: pool)
            if(connection.isOpen())
            connection.close();
    }
}
