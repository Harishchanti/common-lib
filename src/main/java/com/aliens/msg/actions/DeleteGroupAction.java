package com.aliens.msg.actions;

import com.aliens.msg.hazelcast.CacheManager;
import com.aliens.msg.hazelcast.QueueInfo;
import com.aliens.msg.mmq.actions.DeleteQueue;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Provider;
import java.util.Optional;

/**
 * Created by jayant on 4/10/16.
 */

@Component
@Scope("prototype")
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class DeleteGroupAction {

    @Autowired
    Provider<DeleteQueue> deleteQueueProvider;
    @Autowired
    BackupQueueInfoProxy backupQueueInfoProxy;

    @Autowired
    CacheManager cacheManager;

    @Wither
    String groupId;

    public void  invoke()
    {
        Optional<QueueInfo> queueInfoOptional =cacheManager.findByGroupId(groupId);
        if(queueInfoOptional.isPresent())
        {
            QueueInfo queueInfo =queueInfoOptional.get();
            String queueName = queueInfo.getQueueName();
            deleteQueueProvider.get().withQueueName(queueName);
            cacheManager.deleteKey(groupId);
            backupQueueInfoProxy.delete(queueInfo);
           log.info("Deleting group {}",groupId);
        }
    }
}
