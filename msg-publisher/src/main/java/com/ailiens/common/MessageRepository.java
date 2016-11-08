package com.ailiens.common;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jayant on 8/11/16.
 */
public interface MessageRepository extends JpaRepository<Message,Long> {
}
