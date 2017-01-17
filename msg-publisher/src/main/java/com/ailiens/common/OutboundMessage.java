package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Strings;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by jayant on 18/1/17.
 */

@Entity
@Table(name = "outbound_messages")
@Data
public class OutboundMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final int MAX_PAYLOAD_SIZE =10000;

    public static final DateTimeZone timeZone = DateTimeZone.forID("Asia/Kolkata");

    String payload="";
    String createdAt= LocalDateTime.now(timeZone).toString();;

    @Column(name = "message_id")
    String messageId = UUID.randomUUID().toString();

    @Column(name = "group_id")
    String groupId=UUID.randomUUID().toString();

    String status;

    @Transient
    @JsonProperty("eventType")
    @Getter
    @Setter
    String eventType;

    boolean sent=true;
    String topic;

    int retries=0;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
