package com.ailiens.common;

import com.google.common.base.Strings;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by jayant on 30/3/17.
 */


@Component
public class InboundMessageFilter implements Filter {

    static final String MESSAGE_ID_HEADER ="X-MESSAGE-ID";

    @Autowired
    InboundLoggingService inboundLoggingService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    @Transactional
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest servletRequest = (HttpServletRequest)request;

        String messageId=servletRequest.getHeader(MESSAGE_ID_HEADER);

        if(!Strings.isNullOrEmpty(messageId)) {
            List<String> list= inboundLoggingService.findByMessageId(messageId);


            if ( list==null ||  list.size()==0 ||  Integer.parseInt(list.get(0))/100 != 2) {
                chain.doFilter(request, response);

                HttpServletResponse httpServletResponse = (HttpServletResponse) response;

                int status = httpServletResponse.getStatus();



                MsgMessage message = new MsgMessage();
                message.setMessageId(messageId);
                inboundLoggingService.save(message,String.valueOf(status),"");
            } else {
                response.getWriter().write("Message already processed");
                ((HttpServletResponse) response).setStatus(200);
            }
        }
        else chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
