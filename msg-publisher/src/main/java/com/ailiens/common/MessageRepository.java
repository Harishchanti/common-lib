package com.ailiens.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jayant on 8/11/16.
 */
@Repository
public interface MessageRepository extends JpaRepository<MsgMessage,Long> {
}
