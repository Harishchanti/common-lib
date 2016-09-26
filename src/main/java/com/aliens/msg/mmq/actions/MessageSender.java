package com.aliens.msg.mmq.actions;

import com.aliens.msg.config.RabbitMqConfig;
import com.aliens.msg.mmq.MMQUtil;
import com.aliens.msg.mmq.Message;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 14/9/16.
 */
@Slf4j
@Component
public class MessageSender {

    static ConnectionFactory factory = new ConnectionFactory();
    static ObjectMapper mapper = new ObjectMapper();

    @Autowired
    RabbitMqConfig rabbitMqConfig;


    public  void sendMessage(Message message, String queName) throws Exception {

        Connection connection=null;
        Channel channel=null;
        try {
            factory.setHost(rabbitMqConfig.getHost());
             connection = factory.newConnection();
             channel = connection.createChannel();

            channel.queueDeclare(queName, false, false, false, null);
            String queueMessage = mapper.writeValueAsString(message);
            channel.basicPublish("", queName, null, queueMessage.getBytes("UTF-8"));
            log.info("Sent Message messageId {} payload {}", message.getMessageId(), message.getPayload());
        }
        catch (Exception e)
        {
            throw  e;
        }
        finally {
            MMQUtil.ensureClosure(connection,channel);
        }
    }
}
