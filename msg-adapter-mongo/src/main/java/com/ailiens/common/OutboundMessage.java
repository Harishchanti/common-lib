package com.ailiens.common;

import lombok.Data;
import org.bson.types.ObjectId;
import org.joda.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.UUID;

import static com.ailiens.common.MsgMessage.timeZone;

/**
 * Created by surabhi on 23/4/17.
 */
@Component
@Data
@Document
public class OutboundMessage implements Serializable,MsgOutbound {
    private static final long serialVersionUID = 1L;

    @Id
    ObjectId id;

    String payload="";

    String createdAt= LocalDateTime.now(timeZone).toString();

    String messageId = UUID.randomUUID().toString();

    String groupId=UUID.randomUUID().toString();

    String status;

    String eventType;

    boolean sent=true;
    String topic;

    int retries=0;

    public void incRetries()
    {
        retries++;
    }

}
