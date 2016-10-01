package com.aliens.msg.mmq;

import com.aliens.msg.config.RabbitMqConfig;
import com.google.common.base.Strings;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Singleton;

/**
 * Created by jayant on 28/9/16.
 */
@Component
@Singleton
public class ConnectionFactoryProxy {

    @Getter
    ConnectionFactory factory = new ConnectionFactory();


    @Autowired
    RabbitMqConfig rabbitMqConfig;

    public Connection getConnection() throws Exception
    {
        return factory.newConnection();
    }

    public void setup()
    {
        factory.setHost(rabbitMqConfig.getHost());

        if(!Strings.isNullOrEmpty(rabbitMqConfig.getUsername()))
        factory.setUsername(rabbitMqConfig.getUsername());

        if(!Strings.isNullOrEmpty(rabbitMqConfig.getPassword()))
        factory.setPassword(rabbitMqConfig.getPassword());
    }
}
