package com.aliens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.MessageProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 14/9/16.
 */
@Slf4j
@Component
public class MessageSender {


    static ObjectMapper mapper = new ObjectMapper();

    @Autowired
    ConnectionFactoryProxy connectionFactory;


    public  void sendMessage(Object message, String queName) throws Exception {

        Connection connection=null;
        Channel channel=null;
        try {

             connection =connectionFactory.getConnection();
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
            MMQUtil.ensureClosure(connection,channel);
        }
    }
}
