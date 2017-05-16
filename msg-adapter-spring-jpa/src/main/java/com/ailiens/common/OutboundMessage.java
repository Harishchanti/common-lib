package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

import static com.ailiens.common.MsgMessage.timeZone;

/**
 * Created by jayant on 18/1/17.
 */

@Entity
@Table(name = "outbound_messages")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OutboundMessage implements Serializable,MsgOutbound {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = MAX_PAYLOAD_SIZE+5)
    String payload="";

    @Column(name = "created_at")
    String createdAt= LocalDateTime.now(timeZone).toString();

    @Column(name = "message_id")
    String messageId = UUID.randomUUID().toString();

    @Column(name = "group_id")
    String groupId=UUID.randomUUID().toString();

    @Column(length = MAX_PAYLOAD_SIZE+5)
    String status;


    @Column(name = "event_type")
    String eventType;

    boolean sent=true;
    String topic;

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
