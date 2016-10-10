package com.aliens.msg.mmq.test;

import com.ailiens.common.Message;
import com.ailiens.common.RabbitMqMessageSender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 26/9/16.
 */
@AllArgsConstructor
@Component
@NoArgsConstructor
public class TestMessageSender  implements Runnable {

    @Wither
    String groupId;

    @Wither
    String queName;

    @Autowired
    RabbitMqMessageSender rabbitMqMessageSender;

    @Override
    public void run() {

        int i;
        for(i=1;i<=40;i++)
        {
            try {
                Message message = new Message();
                message.setMessageId(String.valueOf(i));
                message.setGroupId(groupId);
                rabbitMqMessageSender.sendMessage(message, queName);
            }catch (Exception e)
            {
            	System.out.println("Excepion in sending mesage");
            }
        }
    }
}
