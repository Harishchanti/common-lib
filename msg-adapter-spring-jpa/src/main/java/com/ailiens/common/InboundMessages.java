package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

import static com.ailiens.common.MsgMessage.timeZone;

/**
 * A InboundMessages.
 */
@Entity
@Table(name = "inbound_messages")
@Slf4j
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InboundMessages implements Serializable,MsgInbound {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "message_id")
    private String messageId;

    @Column(name = "group_id")
    private String groupId;

    @Column(name = "payload",length = MAX_PAYLOAD_SIZE+5)
    private String payload;


    @Column(length = MAX_PAYLOAD_SIZE+5)
    private String response;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "created_at")
    String createdAt= LocalDateTime.now(timeZone).toString();

    @Column(name = "handler_response",length = MAX_PAYLOAD_SIZE+5)
    private String handlerResponse;



    @PrePersist
    public void checkSize()
    {
        payload=clip(payload);
        response=clip(response);
        handlerResponse=clip(handlerResponse);
    }


}
