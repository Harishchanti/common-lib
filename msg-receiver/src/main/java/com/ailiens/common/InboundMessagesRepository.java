package com.ailiens.common;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the InboundMessages entity.
 */
@SuppressWarnings("unused")
public interface InboundMessagesRepository extends JpaRepository<InboundMessages,Long> {

}
