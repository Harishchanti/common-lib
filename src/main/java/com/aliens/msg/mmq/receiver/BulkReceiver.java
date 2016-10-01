package com.aliens.msg.mmq.receiver;

import com.aliens.msg.models.InboundMessages;
import com.aliens.msg.repositories.InboundMessagesRepository;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jayant on 29/9/16.
 */

@Component
@Scope("prototype")
public class BulkReceiver extends BaseBulkMessageReceiver {

    @Autowired
    InboundMessagesRepository inboundMessagesRepository;

    @Override
    public Status action(List<Message> messageList) throws Exception {

        for(Message message: messageList) {
            InboundMessages inboundMessages = new InboundMessages();
            inboundMessages.setGroupId(message.getGroupId());
            inboundMessages.setMessageId(message.getMessageId());
            inboundMessagesRepository.save(inboundMessages);
        }

        return Status.SUCCESS;
    }
}
