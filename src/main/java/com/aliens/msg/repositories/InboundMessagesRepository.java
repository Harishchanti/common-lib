package com.aliens.msg.repositories;

import com.aliens.msg.models.InboundMessages;

import org.springframework.data.jpa.repository.*;

/**
 * Spring Data JPA repository for the InboundMessages entity.
 */
@SuppressWarnings("unused")
public interface InboundMessagesRepository extends JpaRepository<InboundMessages,Long> {

}
