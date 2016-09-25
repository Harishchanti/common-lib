package com.aliens.msg.mmq;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MessageReceiver {

    private static ObjectMapper mapper = new ObjectMapper();
    private static ConnectionFactory factory = new ConnectionFactory();

    @Wither
    long timeout=10*1000;

    @Wither
    boolean autoAck=false;

    @Wither
    String queueName;

    Connection connection;
    Channel channel;



    public  Object action(Message message, AMQP.BasicProperties properties) throws Exception
    {
        return null;
    }


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
                    channel.queueDelete(queueName);
                    return ChannelResponse.QUEUE_PROCESSED;
                }

                String messageStr = new String(delivery.getBody());


                Message message = mapper.readValue(messageStr.getBytes(), Message.class);

                try {
                    action(message, delivery.getProperties());
                }
                catch (Exception e)
                {
                    return ChannelResponse.MESSAGE_FAILED;
                }


                if(!autoAck)
                channel.basicAck(delivery.getEnvelope().getDeliveryTag(),false);
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
