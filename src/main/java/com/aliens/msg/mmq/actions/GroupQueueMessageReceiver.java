package com.aliens.msg.mmq.actions;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.aliens.hipster.domain.InboundMessages;
import com.aliens.hipster.repository.InboundMessagesRepository;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.Status;
import com.rabbitmq.client.AMQP;

/**
 * Created by jayant on 25/9/16.
 */
@Component
@Scope("prototype")
public class GroupQueueMessageReceiver extends MessageReceiver {

	@Autowired
	SendMessageToMycroft sendMessageToMycroft;

	@Autowired
	InboundMessagesRepository inboundMessagesRepository;

	@Override
	public Status action(Message message, AMQP.BasicProperties properties) throws Exception {
		// call mycroft here
		try {

			
			System.out.println("inside Action");
			JSONObject mycroftPayload = new JSONObject(message.getPayload());
			String response = sendMessageToMycroft.withMycroftPayload(mycroftPayload).invoke();

			InboundMessages inboundMessages = new InboundMessages();
			inboundMessages.setGroupId(message.getGroupId());
			inboundMessages.setMessageId(message.getMessageId());
			inboundMessagesRepository.save(inboundMessages);
			return Status.SUCCESS;
		} catch (Exception ex) {
			return Status.FAILED;

		}
	}

}
