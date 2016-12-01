package com.ailiens.common;

import com.google.common.base.Strings;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by jayant on 26/11/16.
 */

@Component
public class LoggingFilter implements Filter {

    public static final String REQ_ID_MDC ="REQ-ID";
    public static final String REQ_ID_HEADER="X-REQ-ID";

    public static final String TRACE_ID_MDC ="TRACE-ID";
    public static final String TRACE_ID_HEADER="X-TRACE-ID";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String reqId=((HttpServletRequest)request).getHeader(REQ_ID_HEADER);
        if(!Strings.isNullOrEmpty(reqId))
        {
            MDC.put(REQ_ID_MDC,reqId);
        }
        else MDC.put(REQ_ID_MDC,UUID.randomUUID().toString());

        String traceId=((HttpServletRequest)request).getHeader(TRACE_ID_HEADER);
        if(!Strings.isNullOrEmpty(traceId))
        {
            MDC.put(TRACE_ID_MDC,traceId);
        }
        else MDC.put(TRACE_ID_MDC,UUID.randomUUID().toString());

        chain.doFilter(request,response);
        MDC.clear();
    }

    @Override
    public void destroy() {
       MDC.clear();
    }


    public static String  getRequestId()
    {
        Object obj= MDC.get(REQ_ID_MDC);
        String reqId=null;
        if(obj!=null) {
            reqId = obj.toString();
        }
        if (Strings.isNullOrEmpty(reqId)) {
            reqId = UUID.randomUUID().toString();
        }

       return reqId;
    }

    public static String  getTraceId()
    {
        Object obj= MDC.get(TRACE_ID_MDC);

        if(obj!=null) {
            return obj.toString();
        }

        else return UUID.randomUUID().toString();
    }
}
