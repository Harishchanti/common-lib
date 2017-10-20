package com.ailiens.common.interceptors;

import static com.ailiens.common.LoggingFilter.REQ_ID_HEADER;
import static com.ailiens.common.LoggingFilter.TRACE_ID_HEADER;
import static com.ailiens.common.RequestContext.generateRequestId;

import com.ailiens.common.RequestContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;


@Component
public class RestTemplateInterceptor implements ClientHttpRequestInterceptor
    ,LoggingInterceptor {

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		HttpHeaders headers = request.getHeaders();
		if (headers.containsKey(TRACE_ID_HEADER)) {
			// do nothing
		} else {
			String traceId = RequestContext.getTraceId();
			headers.add(TRACE_ID_HEADER, traceId);
		}
		headers.add(REQ_ID_HEADER,generateRequestId());
		traceRequest(request,body);
        ClientHttpResponse response= execution.execute(request, body);
        traceResponse(response);
        return response;
	}



    private void traceRequest(HttpRequest request, byte[] body) throws IOException {
        log.info("===========================request begin================================================");
        log.info("URI         : {}", request.getURI());
        log.info("Method      : {}", request.getMethod());
        log.info("RequestId     : {}", request.getHeaders().get(REQ_ID_HEADER) );
        log.info("Request body: {}", new String(body, "UTF-8"));
        log.info("==========================request end================================================");
    }

    private void traceResponse(ClientHttpResponse response) throws IOException {
        StringBuilder inputStringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getBody(), "UTF-8"));
        String line = bufferedReader.readLine();
        while (line != null) {
            inputStringBuilder.append(line);
            inputStringBuilder.append('\n');
            line = bufferedReader.readLine();
        }
        log.info("============================response begin==========================================");
        log.info("Status code  : {}", response.getStatusCode());
        log.info("Response body: {}", inputStringBuilder.toString());
        log.info("=======================response end=================================================");
    }

}
