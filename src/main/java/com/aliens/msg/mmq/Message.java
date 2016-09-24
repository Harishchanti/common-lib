package com.aliens.msg.mmq;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

import java.util.UUID;

/**
 * Created by jayant on 15/9/16.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Message {

    protected static final DateTimeZone timeZone = DateTimeZone.forID("Asia/Kolkata");

    String payload;

    String createdAt = LocalDateTime.now(timeZone).toString();

    String messageId= UUID.randomUUID().toString();

    String groupId= UUID.randomUUID().toString();
}
