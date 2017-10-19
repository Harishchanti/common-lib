package com.ailiens.common.wrappers;

import com.ailiens.common.interceptors.OkHttpInterceptor;
import lombok.experimental.Delegate;
import okhttp3.OkHttpClient;

/**
 * Created by jayant on 20/10/17.
 */
public class CustomOkHttpClient  {

    @Delegate
    OkHttpClient client;

    static final OkHttpInterceptor interceptor = new OkHttpInterceptor();

    public CustomOkHttpClient()
    {
        client = new OkHttpClient().newBuilder()
            .addInterceptor(interceptor).build();
    }



}
