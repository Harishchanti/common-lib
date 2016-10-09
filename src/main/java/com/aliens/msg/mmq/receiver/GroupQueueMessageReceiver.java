package com.aliens.msg.mmq.receiver;

import com.aliens.msg.models.OutboundMessages;
import com.aliens.msg.repositories.OutboundMessagesRepository;
import com.ailiens.common.Message;
import com.aliens.msg.mmq.Status;
import com.aliens.msg.mmq.actions.SendMessageToClient;
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
    SendMessageToClient sendMessageToClient;

	@Autowired
    OutboundMessagesRepository outboundMessagesRepository;

	@Override
	public Status action(Message message) throws Exception
    {

        sendMessageToClient.withMessage(message)
            .withClient(client).invoke();

        OutboundMessages outboundMessages = new OutboundMessages();
        outboundMessages.setGroupId(message.getGroupId());
        outboundMessages.setMessageId(message.getMessageId());
        outboundMessagesRepository.save(outboundMessages);
        return Status.SUCCESS;
    }

}
