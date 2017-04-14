package com.ailiens.common;

import com.datastax.driver.core.utils.UUIDs;
import lombok.Data;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

import javax.persistence.PrePersist;
import java.io.Serializable;
import java.util.UUID;


/**
 * Created by yashika on 16/2/17.
 */
@Table("outbound_message")
@Data
public class OutboundMessage implements MsgOutbound,Serializable {

    private static final int MAX_PAYLOAD_SIZE =10000;

    public static final DateTimeZone timeZone = DateTimeZone.forID("Asia/Kolkata");

    @PrimaryKeyColumn(name="id",ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    private UUID id = UUIDs.timeBased();

    @Column(value = "payload")
    String payload="";

    @Column(value = "created_at")
    String createdAt= LocalDateTime.now(timeZone).toString();;

    @Column(value = "message_id")
    String messageId = UUID.randomUUID().toString();

    @Column(value = "group_id")
    String groupId=UUID.randomUUID().toString();

    @Column(value = "status")
    String status;

    @Column(value = "event_type")
    String eventType;

    @Column(value = "sent")
    boolean sent=true;

    @Column(value = "topic")
    String topic;

    @Column(value = "retries")
    int retries=0;



    @PrePersist
    public void checkSize()
    {
        payload=clip(payload);
        status=clip(status);
    }

    public void incRetries()
    {
        retries++;
    }



}
