package com.ailiens.common;

import java.io.IOException;
import java.util.UUID;

import static com.ailiens.common.LoggingFilter.REQ_ID_HEADER;
import static com.ailiens.common.LoggingFilter.TRACE_ID_HEADER;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

/**
 * Created by Harish on 11/01/17.
 */
public class RestTemplateLoggingFilter implements ClientHttpRequestInterceptor {

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		HttpHeaders headers = request.getHeaders();
		if (headers.containsKey(TRACE_ID_HEADER)) {
			// do nothing
		} else {
			String traceId = LoggingFilter.getTraceId();
			headers.add(TRACE_ID_HEADER, traceId);
		}
		String reqId = UUID.randomUUID().toString();
		headers.add(REQ_ID_HEADER, reqId);
		return execution.execute(request, body);
	}

}
