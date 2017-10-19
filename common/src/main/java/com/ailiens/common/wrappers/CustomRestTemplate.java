package com.ailiens.common.wrappers;

import com.ailiens.common.interceptors.RestTemplateInterceptor;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jayant on 19/10/17.
 */
public class CustomRestTemplate extends RestTemplate {

    static final List<ClientHttpRequestInterceptor> interceptors = Arrays.asList( new RestTemplateInterceptor());

    public CustomRestTemplate()
    {
        super(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
        this.setInterceptors( interceptors );
    }
}
