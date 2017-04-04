package com.ailiens.common;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by jayant on 1/4/17.
 */

public interface InboundMessageRepository extends
       MongoRepository<InboundMessage,String>
{

    @Query(value = "{ 'messageId' : ?0 , 'status':'Processed'}",fields="{ 'status' : 1}")
    List<InboundMessage> findByMessageId(String messageId);
}

