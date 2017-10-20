package com.ailiens.common;

import static com.ailiens.common.RequestContext.generateRandom;
import static com.ailiens.common.RequestContext.generateRequestId;

import com.google.common.base.Strings;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 26/11/16.
 */

@Component
public class LoggingFilter implements Filter {

	public static final String REQ_ID_MDC = "REQ-ID";
	public static final String REQ_ID_HEADER = "X-REQ-ID";

	public static final String TRACE_ID_MDC = "TRACE-ID";
	public static final String TRACE_ID_HEADER = "X-TRACE-ID";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}



	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String reqId = ((HttpServletRequest) request).getHeader(REQ_ID_HEADER);
		if (!Strings.isNullOrEmpty(reqId)) {
			MDC.put(REQ_ID_MDC, reqId);
		} else
			MDC.put(REQ_ID_MDC, generateRequestId());

		String traceId = ((HttpServletRequest) request).getHeader(TRACE_ID_HEADER);
		if (!Strings.isNullOrEmpty(traceId)) {
			MDC.put(TRACE_ID_MDC, traceId);
		} else
			MDC.put(TRACE_ID_MDC, generateRandom());

		chain.doFilter(request, response);
        MDC.clear();
	}

	@Override
	public void destroy() {
		MDC.clear();
	}


}
