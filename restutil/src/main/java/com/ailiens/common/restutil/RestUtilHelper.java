package com.ailiens.common.restutil;

import com.ailiens.common.restutil.exceptions.GenericServiceException;
import com.ailiens.common.restutil.keycloak.Credentials;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;


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


    public static final String REQ_ID_MDC ="REQ-ID";
    public static final String REQ_ID_HEADER="X-REQ-ID";

    static Gson gson = new Gson();

    protected void logPayload(Object payload)
    {
        if(payload==null)return;
        String contentType= headers.get("content-type");

        if(MediaType.APPLICATION_JSON_VALUE.equals(contentType))
        {
            try {
                log.info(gson.toJson(payload));
            } catch (Exception e) {
                log.info(payload.toString());
            }
        }

    }

    protected void addReqIdHeader()
    {
        if(headers.containsKey(REQ_ID_HEADER)) return;

        String reqId= MDC.get(REQ_ID_MDC).toString();
        if(Strings.isNullOrEmpty(reqId))
        {
            reqId= UUID.randomUUID().toString();
        }
        headers.put(REQ_ID_HEADER,reqId);
    }

    protected String getKeycloakKey()
    {
        return  user;
    }

    protected void checkKeyCloak() throws ExecutionException {

        String key= getKeycloakKey();

        if(!Strings.isNullOrEmpty(key)) {
            String auth = credentials.getAccessToken(key);
            headers.put("Authorization", "Bearer " + auth);
        }
    }

    public void checkStatus(HttpResponse response) throws GenericServiceException {

        log.info(response.getBody().toString());
        String key= getKeycloakKey();

        if(response.getStatus()==401 && !Strings.isNullOrEmpty(key) )
        {
            credentials.updateKey(key);
        }


        checkResponse(response.getStatus());
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

        // Unirest.setTimeouts(10*1000,2*60*1000);
    }
}
