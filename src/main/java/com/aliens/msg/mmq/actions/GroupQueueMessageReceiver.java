package com.aliens.msg.mmq.actions;

import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.Status;
import com.rabbitmq.client.AMQP;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 25/9/16.
 */
@Component
@Scope("prototype")
public class GroupQueueMessageReceiver extends MessageReceiver {

    @Override
    public Status action(Message message, AMQP.BasicProperties properties) throws Exception {
        //call mycroft here
        Thread.sleep(1000);
        return Status.SUCCESS;
    }
}
