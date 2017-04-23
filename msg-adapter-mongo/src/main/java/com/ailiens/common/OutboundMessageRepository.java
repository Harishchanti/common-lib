package com.ailiens.common;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by jayant on 23/4/17.
 */
public interface OutboundMessageRepository extends MongoRepository<OutboundMessage,String> {

    List<OutboundMessage> findBySentIsFalse(Pageable pageable);

}
