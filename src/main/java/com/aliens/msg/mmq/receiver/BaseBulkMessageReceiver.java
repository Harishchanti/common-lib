package com.aliens.msg.mmq.receiver;

import com.aliens.hipster.domain.Clients;
import com.aliens.msg.config.RabbitMqConfig;
import com.aliens.msg.mmq.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.QueueingConsumer;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by jayant on 28/9/16.
 */

@Slf4j
@Data
@NoArgsConstructor
public abstract class BaseBulkMessageReceiver {

    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    RabbitMqConfig rabbitMqConfig;
    @Autowired
    ConnectionFactoryProxy connectionFactory;

    final boolean autoAck = false;

    Connection connection;
    Channel channel;

    String threadName;
    String queueName;
    Clients client;

    public BaseBulkMessageReceiver withThreadName(String threadName) {
        this.threadName=threadName;
        return this;
    }

    public BaseBulkMessageReceiver withClient(Clients client) {
        this.client=client;
        return this;
    }


    public BaseBulkMessageReceiver withQueueName(String queueName) {
        this.queueName=queueName;
        return this;
    }


    public abstract Status action(List<Message> messageList) throws Exception;

    public ChannelResponse consumeMessage() {
        try {
            connection = connectionFactory.getConnection();
            channel = connection.createChannel();

            AMQP.Queue.DeclareOk dok = channel.queueDeclare(queueName, false, false, false, null);

            if (dok.getMessageCount() < client.getBulkCount())
                return ChannelResponse.NOT_ENOUGH_MESSAGES;

            log.info("listening to queue {}", queueName);

            QueueingConsumer consumer = new QueueingConsumer(channel);

            channel.basicConsume(queueName, autoAck, consumer);
            long timeout = rabbitMqConfig.getTimeout();

            while (true) {
                List<Message> messageList = Lists.newArrayList();
                List<Long> deliveryTag = Lists.newArrayList();
                int count = 0;
                while (true) {
                    QueueingConsumer.Delivery delivery = consumer.nextDelivery(timeout);
                    if (delivery == null) break;
                    String messageStr = new String(delivery.getBody());

                    Message message = objectMapper.readValue(messageStr.getBytes(), Message.class);
                    log.info("Received message {}", message.getMessageId());
                    messageList.add(message);
                    deliveryTag.add(delivery.getEnvelope().getDeliveryTag());
                    count++;
                    if (count >= client.getBulkCount()) break;
                }

                if (messageList.size() == 0)
                    return ChannelResponse.QUEUE_PROCESSED;
                if (messageList.size() < client.getBulkCount())
                    return ChannelResponse.NOT_ENOUGH_MESSAGES;

                Status status = null;
                try {
                    status = action(messageList);
                } catch (Exception e) {
                    return ChannelResponse.MESSAGE_FAILED;
                }


                if (status == Status.SUCCESS)
                    for (Long tag : deliveryTag) {
                        channel.basicAck(tag, false);
                    }
            }


        } catch (Exception e) {
            log.info("got error while reading queue {} {}", queueName, ExceptionUtils.getStackTrace(e));
            return ChannelResponse.ERROR;
        } finally {
            MMQUtil.ensureClosure(connection, channel);
        }
    }

}
