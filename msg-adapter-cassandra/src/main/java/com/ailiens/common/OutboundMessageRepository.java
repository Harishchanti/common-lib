package com.ailiens.common;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by yashika on 16/2/17.
 */
public interface OutboundMessageRepository extends CassandraRepository<OutboundMessage> {

    @Query("select * from outbound_message where sent=False ALLOW FILTERING")
    List<OutboundMessage> getFailedMessages(Pageable pageable);

}
