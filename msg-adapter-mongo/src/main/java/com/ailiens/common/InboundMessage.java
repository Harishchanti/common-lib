package com.ailiens.common;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.joda.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

import static com.ailiens.common.MsgMessage.timeZone;

/**
 * Created by jayant on 1/4/17.
 */

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Document
public class InboundMessage implements Serializable,MsgInbound {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    String messageId;
    String groupId;
    String payload;

    String status;
    String handlerResponse;

    String createdAt= LocalDateTime.now(timeZone).toString();
}
