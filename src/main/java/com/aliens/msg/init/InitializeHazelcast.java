package com.aliens.msg.init;

import com.aliens.common.BootStrap;
import com.aliens.msg.hazelcast.CacheManager;
import com.aliens.msg.hazelcast.QueueInfo;
import com.aliens.msg.hazelcast.QueueState;
import com.aliens.msg.repositories.HzBackupRepository;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static com.aliens.msg.Constants.timeZone;

/**
 * Created by jayant on 3/10/16.
 */
@Component
@Scope("prototype")
@Slf4j
public class InitializeHazelcast implements BootStrap {

    @Autowired
    HzBackupRepository hzBackupRepository;
    @Autowired
    CacheManager cacheManager;

    @Override
    public void setup() throws Exception {

        log.info("Loading hazelcast");

        hzBackupRepository.findAll().forEach( hzBackup -> {

          if(!cacheManager.findByGroupId(hzBackup.getGroupName()).isPresent()) {

              QueueInfo queueInfo = QueueInfo.builder()
                  .queueName(hzBackup.getQueueName())
                  .clientName(hzBackup.getClientName())
                  .createdAt(LocalDateTime.now(timeZone).toString())
                  .groupName(hzBackup.getGroupName())
                  .build();

              cacheManager.updateData(queueInfo, QueueState.IDLE);
              cacheManager.updateAvailbleQueue(hzBackup.getClientName(),hzBackup.getGroupName());
          }
      });
    }
}
