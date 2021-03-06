package com.ailiens.common.restutil;


import com.ailiens.common.restutil.exceptions.GenericServiceException;
import com.ailiens.common.restutil.keycloak.Credentials;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequestWithBody;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.MapUtils;

/**
 * Created by jayant on 13/9/16.
 */

@Component
@Scope("prototype")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
@EnableRetry(proxyTargetClass=true)
public class RestUtil  extends RestUtilHelper  {


    public RestUtil()
    {
        headers.put("content-type",MediaType.APPLICATION_JSON_VALUE);
    }

    public RestUtil(ObjectMapper objectMapper, Credentials credentials)
    {
        this.objectMapper =objectMapper;
        this.credentials = credentials;
    }



    @Retryable(maxAttempts = 2, backoff = @Backoff(delay = 2000),include = {Exception.class})
    public  <T> HttpResponse<T> get(String url,  Class <? extends T> responseClass) throws  UnirestException,GenericServiceException {


        preProcess(url,null);

        HttpResponse<T> response = Unirest.get(url)
                .headers(headers)
            .asObject(responseClass);

        checkStatus(response);

        return response;
    }

    @Retryable(maxAttempts = 2, backoff = @Backoff(delay = 2000),include = {Exception.class})
    public  <T> HttpResponse<T> post(String url, String payload, Class <? extends T> responseClass) throws  UnirestException,GenericServiceException {


        preProcess(url,payload);
        HttpResponse<T> response = Unirest.post(url)
            .headers(headers)
            .body(payload)
            .asObject(responseClass);


        checkStatus(response);

        return response;
    }


    @Retryable(maxAttempts = 2, backoff = @Backoff(delay = 2000),include = {Exception.class})
    public  <T> HttpResponse<T> post(String url, HashMap<String,File> map,Class <? extends T> responseClass) throws  UnirestException,GenericServiceException {


        preProcess(url,"");
        HttpRequestWithBody requestWithBody=  Unirest.post(url)
            .headers(headers);

        if(!MapUtils.isEmpty(map)) {
            for (Entry<String, File> entry : map.entrySet()) {
                requestWithBody.field(entry.getKey(), entry.getValue());
            }
        }

        HttpResponse<T> response = requestWithBody
            .asObject(responseClass);


        checkStatus(response);

        return response;
    }

    @Retryable(maxAttempts = 2, backoff = @Backoff(delay = 2000),include = {Exception.class})
    public  <T> HttpResponse<T> post(String url, Object payload, Class <? extends T> responseClass) throws  UnirestException,GenericServiceException {


        preProcess(url,payload);
        HttpResponse<T> response = Unirest.post(url)
                .headers(headers)
                .body(payload)
                .asObject(responseClass);


        checkStatus(response);

        return response;
    }

    @Retryable(maxAttempts = 2, backoff = @Backoff(delay = 2000),include = {Exception.class})
    public  <T> HttpResponse<T> put(String url, Object payload, Class <? extends T> responseClass) throws  UnirestException,GenericServiceException  {

        preProcess(url,payload);
        HttpResponse<T> response = Unirest.put(url)
                .headers(headers)
                .body(payload)
                .asObject(responseClass);

        checkStatus(response);

        return response;
    }

    @Retryable(maxAttempts = 2, backoff = @Backoff(delay = 2000),include = {Exception.class})
    public  <T> HttpResponse<T> put(String url, String payload, Class <? extends T> responseClass) throws  UnirestException,GenericServiceException  {

        preProcess(url,payload);
        HttpResponse<T> response = Unirest.put(url)
            .headers(headers)
            .body(payload)
            .asObject(responseClass);

        checkStatus(response);

        return response;
    }

    @Retryable(maxAttempts = 2, backoff = @Backoff(delay = 2000),include = {Exception.class})
    public  <T> HttpResponse<T> delete(String url, Object payload, Class <? extends T> responseClass) throws UnirestException,GenericServiceException  {

        preProcess(url,payload);
        HttpResponse<T> response = Unirest.delete(url)
            .headers(headers)
            .body(payload)
            .asObject(responseClass);

        checkStatus(response);

        return response;
    }

    @Retryable(maxAttempts = 2, backoff = @Backoff(delay = 2000),include = {Exception.class})
    public  <T> HttpResponse<T> delete(String url, String payload, Class <? extends T> responseClass) throws UnirestException,GenericServiceException  {

        preProcess(url,payload);
        HttpResponse<T> response = Unirest.delete(url)
            .headers(headers)
            .body(payload)
            .asObject(responseClass);

        checkStatus(response);

        return response;
    }


    public  <T> T get(String url, TypeReference<T> typeReference) throws  UnirestException,GenericServiceException, IOException {


            String responseStr = get(url, String.class).getBody();
            return objectMapper.readValue(responseStr, typeReference);

    }

    public  <T> List<T> getPaginated(String url, TypeReference<List<T>> typeReference) throws  UnirestException,GenericServiceException, IOException {

        if(pageSize==0) {
            String responseStr = get(url, String.class).getBody();
            return objectMapper.readValue(responseStr, typeReference);
        }
        else
        {
            List<T> responseList = Lists.newArrayList();
            int page=0;
            boolean hasMore=true;
            char beginChar='?';
            if(url.contains("?"))
                beginChar='&';

            do {
                String pageUrl=String.format("%s%cpage=%d&size=%d",url,beginChar,page,pageSize);
                String responseStr = get(pageUrl, String.class).getBody();
                List<T> list= objectMapper.readValue(responseStr, typeReference);
                responseList.addAll(list);
                page++;
                if(list.size()==0)hasMore=false;
            }while (hasMore);

            return responseList;
        }
    }


    //withers

    public RestUtil header(String key,String value)
    {
        headers.put(key,value);
        return this;
    }

    public RestUtil withHeaders(Map<String,String> headers)
    {
        this.headers=headers;
        return this;
    }

    public void addHeaders(Map<String,String> headers)
    {
        this.headers.putAll(headers);
    }

    public RestUtil withUser(String user)
    {
        this.user=user;
        return this;
    }

    public RestUtil withPageSize(int pageSize)
    {
        this.pageSize =pageSize;
        return this;
    }

    public RestUtil logRequest(boolean logRequest)
    {
        this.logRequests=logRequest;
        return this;
    }

    public RestUtil logResponse(boolean logResponse)
    {
        this.logResponse=logResponse;
        return this;
    }


}
