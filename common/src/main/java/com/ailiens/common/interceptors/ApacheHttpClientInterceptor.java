package com.ailiens.common.interceptors;

import static com.ailiens.common.LoggingFilter.REQ_ID_HEADER;
import static com.ailiens.common.LoggingFilter.TRACE_ID_HEADER;

import com.ailiens.common.RequestContext;
import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

public class ApacheHttpClientInterceptor implements HttpRequestInterceptor {

	@Override
	public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {

		Header[] traceIds = request.getHeaders(TRACE_ID_HEADER);
		Header[] requestIds = request.getHeaders(REQ_ID_HEADER);
		if (traceIds.length == 0) {
			request.addHeader(TRACE_ID_HEADER, RequestContext.getTraceId());
		}
		if (requestIds.length == 0) {
			request.addHeader(REQ_ID_HEADER, RequestContext.getRequestId());
		}
		System.out.println(request.getAllHeaders());
	}

}
