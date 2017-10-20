package com.ailiens.common.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jayant on 19/10/17.
 */
public interface LoggingInterceptor {

     Logger log = LoggerFactory
        .getLogger("LoggingInterceptor");
}
