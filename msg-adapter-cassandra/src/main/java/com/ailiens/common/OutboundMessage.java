package com.ailiens.common;

import com.google.common.base.Strings;
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
import java.util.concurrent.atomic.AtomicLong;


/**
 * Created by yashika on 16/2/17.
 */
@Table("outbound_message")
@Data
public class OutboundMessage implements MsgOutbound,Serializable {

    private static final AtomicLong sequence = new AtomicLong();

    private static final int MAX_PAYLOAD_SIZE =10000;

    public static final DateTimeZone timeZone = DateTimeZone.forID("Asia/Kolkata");

    @PrimaryKeyColumn(name="id",ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    private Long id = sequence.incrementAndGet();

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

     private String clip(String str)
    {
        if(Strings.isNullOrEmpty(str))return null;
        if(str.length()>MAX_PAYLOAD_SIZE)
            return str.substring(0,MAX_PAYLOAD_SIZE)+"...clipped";
        else return str;
    }

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
