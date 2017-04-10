package com.ailiens.common;

import com.google.common.base.Strings;
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
public class InboundMessages implements Serializable,MsgInbound {

    private static final long serialVersionUID = 1L;
    private static final int MAX_PAYLOAD_SIZE =10000;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "message_id")
    private String messageId;

    @Column(name = "group_id")
    private String groupId;

    @Column(name = "payload",length = 11000)
    private String payload;


    private String response;
    private String eventType;

    String createdAt= LocalDateTime.now(timeZone).toString();;

    @Column(name = "handler_response",length = 11000)
    private String handlerResponse;

    private String clip(String str)
    {
        if(Strings.isNullOrEmpty(str))return "";

        if(str.length()>MAX_PAYLOAD_SIZE)
        {
            log.info("Clipping data");
            return str.substring(0,MAX_PAYLOAD_SIZE)+"...clipped";
        }
        else return str;
    }

    @PrePersist
    public void checkSize()
    {
        payload=clip(payload);
        response=clip(response);
        handlerResponse=clip(handlerResponse);
    }


}
