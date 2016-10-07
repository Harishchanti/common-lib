package com.aliens.common;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 27/9/16.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Component
@Configuration
@ConfigurationProperties(prefix = "spring.rabbit")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RabbitMqConfig {

    @Value("${spring.rabbit.host}")
    String host;
    @Value("${spring.rabbit.username}")
    String username;
    @Value("${spring.rabbit.password}")
    String password;

    Integer queueLimit;
    long timeout;
    long threadLifeTime;
    long sleepInterval;
    int maxWaitTime;
    int poolSize;
}
