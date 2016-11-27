package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
public class MsgPublisher {


    static ObjectMapper mapper = new ObjectMapper();

    @Wither
    String clusterName;

    @Wither
    boolean dbPersist=true;

    @Autowired
    MessageRepository messageRepository;



    public  void publish(MsgMessage message, String queName,Map<String,Object> headers,boolean persist) throws Exception {


        Channel channel=null;
        try {

            channel =RabbitMqConnectionManager.getChannel(clusterName);

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
            RabbitMqUtil.ensureClosure(channel);
        }
    }

    public void publish(MsgMessage msgMessage, String queueName) throws Exception
    {
        log.info("Sending message {} payload {}",msgMessage.getMessageId(),msgMessage.getPayload());


        Channel channel=null;
        try {

            channel =RabbitMqConnectionManager.getChannel(clusterName);

            channel.queueDeclare(queueName, true, false, false, null);
            String queueMessage = mapper.writeValueAsString(msgMessage);
            channel.basicPublish("", queueName, MessageProperties.PERSISTENT_TEXT_PLAIN, queueMessage.getBytes("UTF-8"));

            if(dbPersist)
            messageRepository.save(msgMessage);
        }
        catch (Exception e)
        {
            throw e;
        }
        finally {
            RabbitMqUtil.ensureClosure(channel);
        }
    }


    public void exchangePublish(MsgMessage msgMessage, String exchangeName) throws Exception
    {
        log.info("Sending message {} payload {}",msgMessage.getMessageId(),msgMessage.getPayload());


        Channel channel=null;
        try {

            channel =RabbitMqConnectionManager.getChannel(clusterName);

            String queueMessage = mapper.writeValueAsString(msgMessage);
            channel.exchangeDeclare(exchangeName,"fanout");
            channel.basicPublish(exchangeName, "", MessageProperties.PERSISTENT_TEXT_PLAIN, queueMessage.getBytes("UTF-8"));

            if(dbPersist)
                messageRepository.save(msgMessage);
        }
        catch (Exception e)
        {
            throw e;
        }
        finally {
            RabbitMqUtil.ensureClosure(channel);
        }
    }
}
