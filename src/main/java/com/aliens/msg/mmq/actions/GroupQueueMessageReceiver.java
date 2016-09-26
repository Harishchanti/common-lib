package com.aliens.msg.mmq.actions;

import com.aliens.hipster.domain.InboundMessages;
import com.aliens.hipster.repository.InboundMessagesRepository;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.Status;
import com.rabbitmq.client.AMQP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 25/9/16.
 */
@Component
@Scope("prototype")
public class GroupQueueMessageReceiver extends MessageReceiver {

    @Autowired
    InboundMessagesRepository inboundMessagesRepository;

    @Override
    public Status action(Message message, AMQP.BasicProperties properties) throws Exception {
        //call mycroft here
        InboundMessages inboundMessages= new InboundMessages();
        inboundMessages.setGroupId(message.getGroupId());
        inboundMessages.setMessageId(message.getMessageId());
        inboundMessagesRepository.save(inboundMessages);
        //Thread.sleep(1000);
        return Status.SUCCESS;
    }
}
