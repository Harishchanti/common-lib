package com.ailiens.common;

import static com.ailiens.common.LoggingFilter.REQ_ID_MDC;
import static com.ailiens.common.LoggingFilter.TRACE_ID_MDC;

import com.ailiens.common.config.LogConfig;
import com.google.common.base.Strings;
import java.util.UUID;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 19/10/17.
 */
@Component
public class RequestContext {

    static LogConfig logConfig;

    @Autowired
    RequestContext(LogConfig logConfig)
    {
        this.logConfig =logConfig;
    }
    public static String getRequestId() {
        Object obj = MDC.get(REQ_ID_MDC);
        String reqId = null;
        if (obj != null) {
            reqId = obj.toString();
        }
        if (Strings.isNullOrEmpty(reqId)) {
            reqId = generateRequestId();
        }

        return reqId;
    }

    public static String getTraceId() {
        Object obj = MDC.get(TRACE_ID_MDC);

        if (obj != null) {
            return obj.toString();
        }

        else
            return generateRandom();
    }

    public  static String generateRandom()
    {
        return UUID.randomUUID().toString().replace("-","");
    }

    public  static String generateRequestId()
    {
        return  String.format("%s:%s",logConfig.getServiceName(),generateRandom());
    }
}
