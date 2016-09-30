package com.aliens.msg.mmq.receiver;

import com.aliens.msg.mmq.Message;
import com.aliens.msg.mmq.Status;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jayant on 29/9/16.
 */

@Component
@Scope("prototype")
public class BulkReceiver extends BaseBulkMessageReceiver {

    @Override
    public Status action(List<Message> messageList) throws Exception {
        return Status.SUCCESS;
    }
}
