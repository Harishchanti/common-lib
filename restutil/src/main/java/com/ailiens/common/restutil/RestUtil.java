package com.ailiens.common.restutil;


import com.ailiens.common.restutil.exceptions.GenericServiceException;
import com.ailiens.common.restutil.exceptions.UnauthorizedAccessException;
import com.ailiens.common.restutil.keycloak.Credentials;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * Created by jayant on 13/9/16.
 */

@Component
@Scope("prototype")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Slf4j
@EnableRetry(proxyTargetClass=true)
public class RestUtil implements CheckResponse {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    Credentials credentials;

    @Wither
    Map<String,String> headers = new HashMap<>();

    @Wither
    String user;

    public RestUtil header(String key,String value)
    {
        headers.put(key,value);
        return this;
    }



    public RestUtil()
    {
        headers.put("content-type",MediaType.APPLICATION_JSON_VALUE);
    }



    @Retryable(maxAttempts = 2, backoff = @Backoff(delay = 2000),include = {UnauthorizedAccessException.class})
    public  <T> T get(String url,  Class <? extends T> responseClass) throws ExecutionException, UnirestException,GenericServiceException {

        checkKeyCloak();

        log.info(url);

        HttpResponse<T> response = Unirest.get(url)
                .headers(headers)
            .asObject(responseClass);

        checkStatus(response);

        return response.getBody();
    }

    @Retryable(maxAttempts = 2, backoff = @Backoff(delay = 2000),include = {UnauthorizedAccessException.class})
    public  <T> T post(String url, Object payload, Class <? extends T> responseClass) throws ExecutionException, UnirestException,GenericServiceException {

        checkKeyCloak();
        log.info(url);
        log.info(payload.toString());
        HttpResponse<T> response = Unirest.post(url)
                .headers(headers)
                .body(payload)
                .asObject(responseClass);

        checkStatus(response);

        return response.getBody();
    }

    @Retryable(maxAttempts = 2, backoff = @Backoff(delay = 2000),include = {UnauthorizedAccessException.class})
    public  <T> T put(String url, Object payload, Class <? extends T> responseClass) throws ExecutionException, UnirestException,GenericServiceException  {

        checkKeyCloak();
        log.info(url);
        log.info(payload.toString());
        HttpResponse<T> response = Unirest.put(url)
                .headers(headers)
                .body(payload)
                .asObject(responseClass);

        checkStatus(response);

        return response.getBody();
    }

    public  <T> List<T> get(String url, TypeReference<List<T>> typeReference) throws ExecutionException, UnirestException, GenericServiceException, IOException {

        String responseStr= get(url,String.class);
        List<T> responseList=objectMapper.readValue(responseStr,typeReference);
        return responseList;
    }

    public  <T> List<T> post(String url, Object payload, TypeReference<List<T>> typeReference) throws ExecutionException, UnirestException, GenericServiceException, IOException {

        String responseStr= post(url,payload,String.class);
        List<T> responseList=objectMapper.readValue(responseStr,typeReference);
        return responseList;
    }

    private String getKeycloakKey()
    {
        return  user;
    }

    public void checkKeyCloak() throws ExecutionException {

        String key= getKeycloakKey();

        if(!Strings.isNullOrEmpty(key)) {
            String auth = credentials.getAccessToken(key);
            headers.put("Authorization", "Bearer " + auth);
        }
    }

    public  void checkStatus(HttpResponse response) throws GenericServiceException {

        log.info(response.getBody().toString());
        String key= getKeycloakKey();

        if(response.getStatus()==401 && !Strings.isNullOrEmpty(key) )
        {
            credentials.updateKey(key);
        }

        checkResponse(response.getStatus());
    }

    public void setupUnirest()
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

        Unirest.setTimeouts(10*1000,2*60*1000);
    }



    public void setup()  {
        setupUnirest();
    }
}
