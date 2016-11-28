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
        chain.doFilter(request,response);
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
}
