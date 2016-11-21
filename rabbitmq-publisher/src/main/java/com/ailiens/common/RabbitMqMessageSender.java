package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.MessageProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by jayant on 14/9/16.
 */
@Slf4j
@Component
@Scope("prototype")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class RabbitMqMessageSender {


    static ObjectMapper mapper = new ObjectMapper();

    @Wither
    String clusterName;

    @Wither
    boolean dbPersist=true;

    public  void sendMessage(Object message, String queName) throws Exception {

        Connection connection=null;
        Channel channel=null;
        try {

             connection =RabbitMqConnectionManager.getConnection(clusterName);
             channel = connection.createChannel();

            channel.queueDeclare(queName, true, false, false, null);
            String queueMessage = mapper.writeValueAsString(message);
            channel.basicPublish("", queName, MessageProperties.PERSISTENT_TEXT_PLAIN, queueMessage.getBytes("UTF-8"));
        }
        catch (Exception e)
        {
            throw e;
        }
        finally {
            RabbitMqUtil.ensureClosure(connection,channel);
        }
    }

    public  void sendMessage(Object message, String queName,Map<String,Object> headers,boolean persist) throws Exception {

        Connection connection=null;
        Channel channel=null;
        try {

            connection =RabbitMqConnectionManager.getConnection(clusterName);
            channel = connection.createChannel();

            channel.queueDeclare(queName, true, false, false, null);
            String queueMessage = mapper.writeValueAsString(message);
            AMQP.BasicProperties.Builder builder = new AMQP.BasicProperties.Builder().headers(headers);

            if(persist)
                builder.deliveryMode(2);

            AMQP.BasicProperties properties = builder.build();
            channel.basicPublish("", queName, properties, queueMessage.getBytes("UTF-8"));
        }
        catch (Exception e)
        {
            throw e;
        }
        finally {
            RabbitMqUtil.ensureClosure(connection,channel);
        }
    }


}
