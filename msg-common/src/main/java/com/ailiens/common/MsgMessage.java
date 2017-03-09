package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

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
public class MsgMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final DateTimeZone timeZone = DateTimeZone.forID("Asia/Kolkata");

    String payload="";
    String createdAt= LocalDateTime.now(timeZone).toString();;


    String messageId = UUID.randomUUID().toString();
    String groupId=UUID.randomUUID().toString();

    @JsonProperty("eventType")
    String eventType;




}
