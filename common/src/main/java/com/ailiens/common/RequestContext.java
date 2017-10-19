package com.ailiens.common;

import static com.ailiens.common.LoggingFilter.REQ_ID_MDC;
import static com.ailiens.common.LoggingFilter.TRACE_ID_MDC;

import com.google.common.base.Strings;
import java.util.UUID;
import org.slf4j.MDC;

/**
 * Created by jayant on 19/10/17.
 */
public class RequestContext {

    public static String getRequestId() {
        Object obj = MDC.get(REQ_ID_MDC);
        String reqId = null;
        if (obj != null) {
            reqId = obj.toString();
        }
        if (Strings.isNullOrEmpty(reqId)) {
            reqId = generateRandom();
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

    public   static String generateRandom()
    {
        return UUID.randomUUID().toString().replace("-","");
    }
}
