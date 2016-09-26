package com.aliens.msg.mmq.actions;


import com.aliens.msg.mmq.ChannelResponse;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.Status;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class MessageReceiver  {

    private static ObjectMapper mapper = new ObjectMapper();
    private static ConnectionFactory factory = new ConnectionFactory();

    Connection connection;
    Channel channel;


    long timeout=10*1000;
    String threadName;
    String queueName;
    boolean autoAck=false;

    long startTime= System.currentTimeMillis();
    long threadLifeTime=10*1000;


    public MessageReceiver withTimeout(long timeout) {
        this.timeout=timeout;
        return this;
    }


    public MessageReceiver withThreadName(String threadName) {
        this.threadName=threadName;
        return this;
    }


    public MessageReceiver withQueueName(String queueName) {
        this.queueName=queueName;
        return this;
    }


    public MessageReceiver withAutoAck(boolean autoAck) {
        this.autoAck=autoAck;
        return this;
    }



    public abstract Status action(Message message, AMQP.BasicProperties properties) throws Exception;



    public ChannelResponse consumeMessages()  {


        factory.setHost("localhost");
        try {
            connection = factory.newConnection();
            channel = connection.createChannel();

            //channel.basicQos(1);

            channel.queueDeclare(queueName, false, false, false, null);
            log.info("listening to queue {}", queueName);

            QueueingConsumer consumer = new QueueingConsumer(channel);


            channel.basicConsume(queueName, autoAck, consumer);


            while (true) {
                QueueingConsumer.Delivery delivery = consumer.nextDelivery(timeout);

                if(delivery==null)
                {

                    if(!queueName.equals("hello")) {
                        log.info("No message since {} seconds, deleting queue {}", timeout / 1000, queueName);
                        channel.queueDelete(queueName, false, true);
                    }
                    return ChannelResponse.QUEUE_PROCESSED;
                }

                String messageStr = new String(delivery.getBody());


                Message message = mapper.readValue(messageStr.getBytes(), Message.class);
                log.info("Received message {}",message.getMessageId());
                Status status=null;
                try {
                    status=action(message, delivery.getProperties());
                }
                catch (Exception e)
                {
                    return ChannelResponse.MESSAGE_FAILED;
                }

                if(status==Status.RESTART)
                    return ChannelResponse.RESTART;

                if(!autoAck && status==Status.SUCCESS)
                channel.basicAck(delivery.getEnvelope().getDeliveryTag(),false);

                if(System.currentTimeMillis()-startTime > threadLifeTime && queueName.equals("hello"))
                {
                    return ChannelResponse.SCHEDULED_RESTART;
                }
            }

        }
        catch(Exception e)
        {
            log.info("got error while reading queue {} {}",queueName, ExceptionUtils.getStackTrace(e));
            return ChannelResponse.ERROR;
        }
        finally {

            try {
                if (connection != null)
                    connection.close();
                if (channel != null)
                    channel.close();
            }
            catch (Exception e)
            {

            }
        }
    }
}
