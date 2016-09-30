package com.aliens.msg.mmq.actions;

import com.aliens.msg.mmq.ConnectionFactoryProxy;
import com.aliens.msg.mmq.MMQUtil;
import com.aliens.msg.mmq.Message;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
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


    public  void sendMessage(Message message, String queName) throws Exception {

        Connection connection=null;
        Channel channel=null;
        try {

             connection =connectionFactory.getConnection();
             channel = connection.createChannel();

            channel.queueDeclare(queName, false, false, false, null);
            String queueMessage = mapper.writeValueAsString(message);
            channel.basicPublish("", queName, null, queueMessage.getBytes("UTF-8"));
            log.info("Sent Message messageId {} payload {}", message.getMessageId(), message.getPayload());
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
