package com.aliens.common;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 * Created by jayant on 28/9/16.
 */
@Component
@Slf4j
public class ConnectionFactoryProxy   implements BootStrap  {

    ConnectionFactory factory = new ConnectionFactory();

    @Autowired
    RabbitMqConfig rabbitMqConfig;

    List<Connection> connectionList = Lists.newArrayList();
    static int ptr;

    public synchronized Connection getConnection() throws Exception
    {
        Connection connection= connectionList.get(ptr);
        ptr=(ptr+1)%rabbitMqConfig.getPoolSize();
        return connection;
    }

    @Override
    public void setup() throws IOException, TimeoutException {
        factory.setHost(rabbitMqConfig.getHost());

        if(!Strings.isNullOrEmpty(rabbitMqConfig.getUsername()))
        factory.setUsername(rabbitMqConfig.getUsername());

        if(!Strings.isNullOrEmpty(rabbitMqConfig.getPassword()))
        factory.setPassword(rabbitMqConfig.getPassword());


        for(int i=0;i<rabbitMqConfig.getPoolSize();i++)
            connectionList.add(factory.newConnection());

        log.info("Connection pool created");

    }

    @PreDestroy
    public void destroy() throws IOException {
        log.info("Closing Connections");
        for(Connection connection: connectionList)
            connection.close();
    }
}
