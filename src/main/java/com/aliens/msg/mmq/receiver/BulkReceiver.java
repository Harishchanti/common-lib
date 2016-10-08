package com.aliens.msg.mmq.receiver;

import com.aliens.msg.mmq.actions.SendMessageToClient;
import com.aliens.msg.models.OutboundMessages;
import com.aliens.msg.repositories.OutboundMessagesRepository;
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
    OutboundMessagesRepository outboundMessagesRepository;

    @Autowired
    SendMessageToClient sendMessageToClient;

    @Override
    public Status action(List<Message> messageList) throws Exception {

        sendMessageToClient.withClient(client).withMessageList(messageList).invoke();

        for(Message message: messageList) {
            OutboundMessages outboundMessages = new OutboundMessages();
            outboundMessages.setGroupId(message.getGroupId());
            outboundMessages.setMessageId(message.getMessageId());
            outboundMessagesRepository.save(outboundMessages);
        }

        return Status.SUCCESS;
    }
}
