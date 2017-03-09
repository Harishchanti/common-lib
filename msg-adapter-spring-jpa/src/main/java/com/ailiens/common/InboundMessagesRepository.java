package com.ailiens.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Spring Data JPA repository for the InboundMessages entity.
 */
@SuppressWarnings("unused")
public interface InboundMessagesRepository extends JpaRepository<InboundMessages,Long> {

    @Query(
        value = "select m.response from inbound_messages m where m.message_id = ?1 order by id desc limit 1",
        nativeQuery = true
    )
    List<String> findByMessageId(String var1);
}
