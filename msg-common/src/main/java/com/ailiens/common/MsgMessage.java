package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by jayant on 15/9/16.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "outbound_messages")
public class MsgMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final int MAX_PAYLOAD_SIZE =10000;

    public static final DateTimeZone timeZone = DateTimeZone.forID("Asia/Kolkata");

    String payload="";
    String createdAt= LocalDateTime.now(timeZone).toString();;

    @Column(name = "message_id")
    String messageId = UUID.randomUUID().toString();

    @Column(name = "group_id")
    String groupId=UUID.randomUUID().toString();

    @Column(name = "event_id")
    String eventId;

    @Transient
    String eventType;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String clip(String str)
    {
        if(str.length()>MAX_PAYLOAD_SIZE)
            return str.substring(0,MAX_PAYLOAD_SIZE)+"...clipped";
        else return str;
    }

    @PrePersist
    public void checkSize()
    {
        payload=clip(payload);
    }
}