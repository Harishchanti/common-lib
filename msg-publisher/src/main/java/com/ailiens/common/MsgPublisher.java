package com.ailiens.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
    boolean logging =true;

    @Wither
    boolean exceptionLogging =true;

    @Autowired
    OutboundMessageRepository outboundMessageRepository;


    public PublishResponse publish(MsgMessage msgMessage, String queueName)
    {
        log.info("Sending message {} payload {}",msgMessage.getMessageId(),msgMessage.getPayload());


        Channel channel=null;
        try {

            channel =RabbitMqConnectionManager.getChannel(clusterName);

            channel.queueDeclare(queueName, true, false, false, null);
            String queueMessage = mapper.writeValueAsString(msgMessage);
            channel.basicPublish("", queueName, MessageProperties.PERSISTENT_TEXT_PLAIN, queueMessage.getBytes("UTF-8"));

            if(logging)
            {
                OutboundMessage outboundMessage= mapper.convertValue(msgMessage,OutboundMessage.class);
                outboundMessage.setTopic(queueName);
                outboundMessageRepository.save(outboundMessage);
            }
            return PublishResponse.PUBLISHED;
        }
        catch (Exception e)
        {
            if(exceptionLogging) {
                OutboundMessage outboundMessage = mapper.convertValue(msgMessage, OutboundMessage.class);
                outboundMessage.setTopic(queueName);
                outboundMessage.setSent(false);
                outboundMessage.setStatus(ExceptionUtils.getMessage(e));
                outboundMessageRepository.save(outboundMessage);
            }
            log.error("Unable to send message {}",e.getMessage());
            return PublishResponse.ERROR;
        }
        finally {
            RabbitMqUtil.ensureClosure(channel);
        }
    }


    public PublishResponse exchangePublish(MsgMessage msgMessage, String exchangeName)
    {
        log.info("Sending message {} payload {}",msgMessage.getMessageId(),msgMessage.getPayload());


        Channel channel=null;
        try {

            channel =RabbitMqConnectionManager.getChannel(clusterName);

            String queueMessage = mapper.writeValueAsString(msgMessage);
            channel.exchangeDeclare(exchangeName,"fanout");
            channel.basicPublish(exchangeName, "", MessageProperties.PERSISTENT_TEXT_PLAIN, queueMessage.getBytes("UTF-8"));

            if(logging)
            {
                OutboundMessage outboundMessage= mapper.convertValue(msgMessage,OutboundMessage.class);
                outboundMessage.setTopic(exchangeName);
                outboundMessageRepository.save(outboundMessage);
            }
            return PublishResponse.PUBLISHED;
        }
        catch (Exception e)
        {
            if(exceptionLogging) {
                OutboundMessage outboundMessage = mapper.convertValue(msgMessage, OutboundMessage.class);
                outboundMessage.setTopic(exchangeName);
                outboundMessage.setSent(false);
                outboundMessage.setStatus(ExceptionUtils.getMessage(e));
                outboundMessageRepository.save(outboundMessage);
            }
            log.error("Unable to send message {}",e.getMessage());
            return PublishResponse.ERROR;
        }
        finally {
            RabbitMqUtil.ensureClosure(channel);
        }
    }
}
