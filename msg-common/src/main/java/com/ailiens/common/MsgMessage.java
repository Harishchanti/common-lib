package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/**
 * Created by jayant on 15/9/16.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MsgMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final DateTimeZone timeZone = DateTimeZone.forID("Asia/Kolkata");

    String payload="";
    String createdAt= LocalDateTime.now(timeZone).toString();


    String messageId = UUID.randomUUID().toString();
    String groupId=UUID.randomUUID().toString();

    String eventType;

    Map<String,UriInfo> uriMap = new HashMap<>();

    Map<String,String> headers = new HashMap<>();

    public void addHeader(String key,String value)
    {
        headers.put(key,value);
    }


}
