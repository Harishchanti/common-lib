package com.ailiens.common;

import com.codahale.metrics.annotation.Timed;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;



/**
 * Created by jayant on 14/9/16.
 */

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Slf4j
public class MsgPublisherRabbitmq extends TransactionSynchronizationAdapter implements MsgPublisher {


    static ObjectMapper mapper = new ObjectMapper();

    @Autowired(required = false)
    MessageLoggingService messageLogger;

    @Autowired
    MsgConfig msgConfig;

    MsgMessage msgMessage;
    String queueName;
    boolean exchangePublish=false;



    public void registerCallback() {
        if (!TransactionSynchronizationManager.isSynchronizationActive()) {
            log.error("Sync is not enabled");
            return;
        }
        TransactionSynchronizationManager.registerSynchronization(this);
    }

    @Override
    public void afterCompletion(int status) {
        if (status == STATUS_COMMITTED) {
            if(exchangePublish)
            {
                publishToExchange(msgMessage,queueName);
            }
            else {
                publishToQueue(msgMessage,queueName);
            }
        }
    }


    @Override
    public PublishResponse publish(MsgMessage msgMessage, String queueName)
    {
        this.msgMessage = msgMessage;
        this.queueName = queueName;
        registerCallback();
        return PublishResponse.PUBLISHED;
        //return publishToQueue(msgMessage,queueName);
    }


    @Override
    public PublishResponse exchangePublish(MsgMessage msgMessage, String queueName)
    {
        this.msgMessage = msgMessage;
        this.queueName = queueName;
        this.exchangePublish=true;
        //registerCallback();
        return publishToExchange(msgMessage,queueName);
    }

    @Override
    @Timed
    public PublishResponse retry(MsgMessage msgMessage, String exchangeName)
    {


        Channel channel=null;
        try {

            channel =RabbitMqConnectionManager.getChannel();

            String queueMessage = mapper.writeValueAsString(msgMessage);
            channel.exchangeDeclare(exchangeName,"fanout");
            channel.basicPublish(exchangeName, "", MessageProperties.PERSISTENT_TEXT_PLAIN, queueMessage.getBytes("UTF-8"));


            return PublishResponse.PUBLISHED;
        }
        catch (Exception e)
        {
            return PublishResponse.ERROR;
        }
        finally {
            RabbitMqUtil.ensureClosure(channel);
        }
    }

    @Timed
    public PublishResponse publishToQueue(MsgMessage msgMessage, String queueName)
    {


        Channel channel=null;
        try {
            log.info("Sending message {}",msgMessage.getMessageId());

            channel =RabbitMqConnectionManager.getChannel();

            channel.queueDeclare(queueName, true, false, false, null);
            String queueMessage = mapper.writeValueAsString(msgMessage);
            channel.basicPublish("", queueName, MessageProperties.PERSISTENT_TEXT_PLAIN, queueMessage.getBytes("UTF-8"));

            if(msgConfig.isLogging() && messageLogger!=null)
            {
                messageLogger.save(msgMessage,queueName);
            }
            return PublishResponse.PUBLISHED;
        }
        catch (Exception e)
        {
            if(msgConfig.isExceptionLogging() && messageLogger!=null) {

                messageLogger.saveUndelivered(msgMessage,queueName,ExceptionUtils.getMessage(e));
            }

            return PublishResponse.ERROR;
        }
        finally {
            RabbitMqUtil.ensureClosure(channel);
        }
    }



    @Timed
    public PublishResponse publishToExchange(MsgMessage msgMessage, String exchangeName)
    {


        Channel channel=null;
        try {

            log.info("Sending message {}",msgMessage.getMessageId());

            channel =RabbitMqConnectionManager.getChannel();

            String queueMessage = mapper.writeValueAsString(msgMessage);
            channel.exchangeDeclare(exchangeName,"fanout");
            channel.basicPublish(exchangeName, "", MessageProperties.PERSISTENT_TEXT_PLAIN, queueMessage.getBytes("UTF-8"));

            if(msgConfig.isLogging() && messageLogger!=null)
            {
                messageLogger.save(msgMessage,exchangeName);
            }
            return PublishResponse.PUBLISHED;
        }
        catch (Exception e)
        {
            if(msgConfig.isExceptionLogging() && messageLogger!=null) {

                messageLogger.saveUndelivered(msgMessage,exchangeName,ExceptionUtils.getMessage(e));
            }

            return PublishResponse.ERROR;
        }
        finally {
            RabbitMqUtil.ensureClosure(channel);
        }
    }



}
