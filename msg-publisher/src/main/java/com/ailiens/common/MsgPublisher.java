package com.ailiens.common;

import com.codahale.metrics.annotation.Timed;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Singleton;

/**
 * Created by jayant on 14/9/16.
 */

@Component
@Singleton
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class MsgPublisher {


    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    OutboundMessageRepository outboundMessageRepository;

    @Autowired
    MsgConfig msgConfig;


    @Timed
    public PublishResponse publish(MsgMessage msgMessage, String queueName)
    {


        Channel channel=null;
        try {

            channel =RabbitMqConnectionManager.getChannel();

            channel.queueDeclare(queueName, true, false, false, null);
            String queueMessage = mapper.writeValueAsString(msgMessage);
            channel.basicPublish("", queueName, MessageProperties.PERSISTENT_TEXT_PLAIN, queueMessage.getBytes("UTF-8"));

            if(msgConfig.isLogging())
            {
                OutboundMessage outboundMessage= mapper.convertValue(msgMessage,OutboundMessage.class);
                outboundMessage.setTopic(queueName);
                outboundMessageRepository.save(outboundMessage);
            }
            return PublishResponse.PUBLISHED;
        }
        catch (Exception e)
        {
            if(msgConfig.isExceptionLogging()) {
                OutboundMessage outboundMessage = mapper.convertValue(msgMessage, OutboundMessage.class);
                outboundMessage.setTopic(queueName);
                outboundMessage.setSent(false);
                outboundMessage.setStatus(ExceptionUtils.getMessage(e));
                outboundMessageRepository.save(outboundMessage);
            }

            return PublishResponse.ERROR;
        }
        finally {
            RabbitMqUtil.ensureClosure(channel);
        }
    }



    @Timed
    public PublishResponse exchangePublish(MsgMessage msgMessage, String exchangeName)
    {


        Channel channel=null;
        try {

            channel =RabbitMqConnectionManager.getChannel();

            String queueMessage = mapper.writeValueAsString(msgMessage);
            channel.exchangeDeclare(exchangeName,"fanout");
            channel.basicPublish(exchangeName, "", MessageProperties.PERSISTENT_TEXT_PLAIN, queueMessage.getBytes("UTF-8"));

            if(msgConfig.isLogging())
            {
                OutboundMessage outboundMessage= mapper.convertValue(msgMessage,OutboundMessage.class);
                outboundMessage.setTopic(exchangeName);
                outboundMessageRepository.save(outboundMessage);
            }
            return PublishResponse.PUBLISHED;
        }
        catch (Exception e)
        {
            if(msgConfig.isExceptionLogging()) {
                OutboundMessage outboundMessage = mapper.convertValue(msgMessage, OutboundMessage.class);
                outboundMessage.setTopic(exchangeName);
                outboundMessage.setSent(false);
                outboundMessage.setStatus(ExceptionUtils.getMessage(e));
                outboundMessageRepository.save(outboundMessage);
            }

            return PublishResponse.ERROR;
        }
        finally {
            RabbitMqUtil.ensureClosure(channel);
        }
    }
}
