package com.aliens.msg.mmq;

import com.aliens.msg.hazelcast.HzCacheManager;
import com.aliens.msg.hazelcast.QueueInfo;
import com.aliens.msg.hazelcast.QueueState;
import com.rabbitmq.client.AMQP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by jayant on 25/9/16.
 */
@Component
@Scope("prototype")
public class MainQueueMessageReceiver extends MessageReceiver {

    @Autowired
    HzCacheManager hzCacheManager;

    final int limit=100;



    @Override
    public Object action(Message message, AMQP.BasicProperties properties) throws Exception {

        String groupId=message.getGroupId();
        Optional<QueueInfo> queueInfoOptional= hzCacheManager.findByGroupId(groupId);

        if(queueInfoOptional.isPresent())
        {
            String qname=queueInfoOptional.get().getQname();
            MessageSender.sendMessage(message,qname);
        }
        else
        {
            int size=hzCacheManager.getSize();
            if(size<limit)
            {

                if(hzCacheManager.isWaiting(groupId))
                {
                    //restart channel
                    //clear waiting list
                }

                MessageSender.sendMessage(message,groupId);

                QueueInfo queueInfo=QueueInfo.builder()
                    .qname(groupId)
                    .groupName(groupId).build();
                hzCacheManager.updateData(queueInfo, QueueState.IDLE);
            }
            else
            {
                hzCacheManager.putToWait(groupId);
                throw new Exception("Size full");
            }
        }
        return null;
    }
}
