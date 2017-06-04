package com.ailiens.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 3/6/17.
 */



@ConfigurationProperties(prefix = "threadAnalysis")
@Data
@Component
public class ThreadAnalysisConfig {
    String[] recipients;
 String serviceName;
 String cronPattern;
}
