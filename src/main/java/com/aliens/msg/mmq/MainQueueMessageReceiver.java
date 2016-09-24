package com.aliens.msg.mmq;

import com.rabbitmq.client.AMQP;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 25/9/16.
 */
@Component
@Scope("prototype")
public class MainQueueMessageReceiver extends MessageReceiver {

    @Override
    public Object action(Message message, AMQP.BasicProperties properties) throws Exception {
        //segregate here
        return null;
    }
}
