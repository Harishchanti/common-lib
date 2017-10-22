package com.ailiens.common.restutil;

import static com.ailiens.common.LoggingFilter.REQ_ID_HEADER;
import static com.ailiens.common.LoggingFilter.TRACE_ID_HEADER;

import com.ailiens.common.RequestContext;
import com.ailiens.common.restutil.exceptions.GenericServiceException;
import com.ailiens.common.restutil.keycloak.Credentials;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;


/**
 * Created by jayant on 26/11/16.
 */
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class RestUtilHelper implements CheckResponse {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    Credentials credentials;


    Map<String,String> headers = new HashMap<>();
    String user;
    int pageSize=0;
    boolean logRequests=true;
    boolean logResponse =true;

    static Gson gson = new Gson();

    protected void logPayload(Object payload)
    {
        if(!logRequests)return;
        if(payload==null)return;
        String contentType= headers.get("content-type");

        if(MediaType.APPLICATION_JSON_VALUE.equals(contentType))
        {
            try {
                log.info("Request :{}", gson.toJson(payload));
            } catch (Exception e) {
                log.info("Request :{}",payload.toString());
            }
        }

    }

    protected void preProcess(String url,Object payload)  {
        addLoggingHeaders();
        checkKeyCloak();
        log.info(url);
        logPayload(payload);
    }

    protected void addLoggingHeaders()
    {
        String requestId= RequestContext.generateRequestId();
        log.info("RequestId {}",requestId);
        headers.put(REQ_ID_HEADER,requestId);
        headers.put(TRACE_ID_HEADER,RequestContext.getTraceId());
    }

    protected String getKeycloakKey()
    {
        return  user;
    }

    protected void checkKeyCloak()  {

        String key= getKeycloakKey();

        if(!Strings.isNullOrEmpty(key)) {
            String auth = credentials.getAccessToken(key);
            headers.put("Authorization", "Bearer " + auth);
        }
    }

    public void checkStatus(HttpResponse response) throws GenericServiceException {

        String responseBody="No Response";

        if(response.getBody()!=null)
        {
            responseBody=response.getBody().toString();
        }
        if(logResponse)
        {

            log.info("Response {}, {} " , response.getStatus(),responseBody);
        }
        String key= getKeycloakKey();

        if(response.getStatus()==401 && !Strings.isNullOrEmpty(key) )
        {
            log.info("Refreshing accessToken");
            credentials.updateKey(key);
        }


        checkResponse(response.getStatus(),responseBody);
    }

    public void setup()
    {
        Unirest.setObjectMapper(new com.mashape.unirest.http.ObjectMapper() {
            private ObjectMapper jacksonObjectMapper
                = new ObjectMapper();

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
