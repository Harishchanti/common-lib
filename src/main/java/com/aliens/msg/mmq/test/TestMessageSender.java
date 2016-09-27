package com.aliens.msg.mmq.test;

import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.actions.MessageSender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;
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

    @Override
    public void run() {

        int i;
        for(i=1;i<=100;i++)
        {
            try {
                Message message = new Message();
                message.setMessageId(String.valueOf(i));
                message.setGroupId(groupId);
                MessageSender.sendMessage(message, "hello");
            }catch (Exception e)
            {
            	System.out.println("Excepion in sending mesg");
            }
        }
    }
}
