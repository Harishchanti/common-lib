package com.ailiens.common.interceptors;

import static com.ailiens.common.LoggingFilter.REQ_ID_HEADER;
import static com.ailiens.common.LoggingFilter.TRACE_ID_HEADER;

import com.ailiens.common.RequestContext;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by jayant on 19/10/17.
 */

public class OkHttpInterceptor implements Interceptor,LoggingInterceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        String requestId=RequestContext.generateRequestId();

        Request newRequest= request.newBuilder()
                                  .header(TRACE_ID_HEADER, RequestContext.getTraceId())
                                  .header(REQ_ID_HEADER,requestId)
                                  .build();

        RequestBody body=newRequest.body();

        log.info("===========================request begin================================================");
        log.info("URI         : {}", request.url().toString());
        log.info("Method      : {}", request.method().toString());
        log.info("RequestId     : {}", requestId );

        if(body!=null) {
            log.info("Request body: {}", body.toString());
        }
        log.info("==========================request end================================================");


        Response response = chain.proceed(newRequest);

        ResponseBody responseBody = response.body();
        log.info("============================response begin==========================================");
        log.info("Status code  : {}", response.code());
        if(responseBody!=null) {
            log.info("Response body: {}", responseBody.string());
        }
        log.info("=======================response end=================================================");


        return response;
    }
}
