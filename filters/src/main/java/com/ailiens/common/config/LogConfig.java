package com.ailiens.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 20/10/17.
 */
@Data
@ConfigurationProperties
@Component
public class LogConfig {

    String serviceName="";
}
