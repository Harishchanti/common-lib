package com.ailiens.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by jayant on 8/11/16.
 */
public interface MessageRepository extends JpaRepository<MsgMessage,Long> {

    @Query("select m from MsgMessage m where m.sent=0 order by id ASC limit ?1")
    List<MsgMessage> getFailedMessages(int limit);

}
