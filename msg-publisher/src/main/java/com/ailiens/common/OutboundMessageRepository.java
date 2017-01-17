package com.ailiens.common;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by jayant on 8/11/16.
 */
public interface OutboundMessageRepository extends JpaRepository<OutboundMessage,Long> {

    @Query("select m from OutboundMessage m where m.sent=0 order by id ASC")
    List<OutboundMessage> getFailedMessages(Pageable pageable);

}
