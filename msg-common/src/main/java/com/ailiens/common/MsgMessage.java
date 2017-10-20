package com.ailiens.common;

import static com.ailiens.common.LoggingFilter.TRACE_ID_HEADER;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
/**
 * Created by jayant on 15/9/16.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
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

    int retry=0;

    Map<String,UriInfo> uriMap = new HashMap<>();

    Map<String,String> headers = new HashMap<>();

    public MsgMessage() {
        this.createdAt = LocalDateTime.now(timeZone).toString();
        this.messageId = UUID.randomUUID().toString();
        this.groupId = UUID.randomUUID().toString();
        this.retry = 0;
        this.uriMap = new HashMap();
        this.headers = new HashMap();
        headers.put(TRACE_ID_HEADER,RequestContext.getTraceId());
    }


    public void addHeader(String key,String value)
    {
        headers.put(key,value);
    }


}
