package com.ailiens.common.restutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Provider;
import javax.inject.Singleton;

/**
 * Created by jayant on 27/11/16.
 */
@Component
@Singleton
public class RestUtilProvider {


    static Provider<RestUtil> restUtilProvider;

    @Autowired
    public RestUtilProvider(Provider<RestUtil> injectedRestUtilProvider)
    {
        restUtilProvider=injectedRestUtilProvider;
    }

    public static RestUtil getInstance()
    {
        return restUtilProvider.get();
    }
}
