package com.aliens.msg.mmq;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by jayant on 14/9/16.
 */
@Slf4j
public class MessageSender {

    static ConnectionFactory factory = new ConnectionFactory();
    static ObjectMapper mapper = new ObjectMapper();
    static {
        factory.setHost("localhost");
    }

    public static void sendMessage(Object payload,String queName) throws Exception {

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(queName, false, false, false, null);

        String messageStr = mapper.writeValueAsString(payload);
        Message message = new Message();
        message.setPayload(messageStr);

        String queueMessage=mapper.writeValueAsString(message);
        channel.basicPublish("", queName, null, queueMessage.getBytes("UTF-8"));
        log.info("Sent Message messageId {} payload {}",message.getMessageId(),message.getPayload());

        channel.close();
        connection.close();
    }
}
