package com.ailiens.common;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;
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
public class ConnectionFactoryProxy   {

    static ConnectionFactory factory = new ConnectionFactory();



    static List<Connection> connectionList = Lists.newArrayList();
    static int ptr;
    static final int poolSize=3;

    public static synchronized Connection getConnection() throws Exception
    {
        Connection connection= connectionList.get(ptr);
        ptr=(ptr+1)%poolSize;
        return connection;
    }


    public static void setup(String host,String userName,String password) throws IOException, TimeoutException {
        factory.setHost(host);

        if(!Strings.isNullOrEmpty(userName))
        factory.setUsername(userName);

        if(!Strings.isNullOrEmpty(password))
        factory.setPassword(password);


        for(int i=0;i<poolSize;i++)
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
