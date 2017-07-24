package com.ailiens.common;

import static com.ailiens.common.MsgMessage.timeZone;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import lombok.Data;
import org.joda.time.LocalDateTime;

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

    @Column
    @Lob
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

    String url;
    String method;

    @PrePersist
    public void checkSize()
    {
        status=clip(status);
    }

    public void incRetries()
    {
        retries++;
    }
}
