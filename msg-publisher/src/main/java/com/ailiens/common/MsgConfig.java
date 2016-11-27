package com.ailiens.common;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 27/11/16.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Component
@ConfigurationProperties(prefix = "MSG")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MsgConfig {
  String env;
  String userName;
  String password;
  int poolSize;
}
