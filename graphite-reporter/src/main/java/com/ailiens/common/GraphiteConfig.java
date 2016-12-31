package com.ailiens.common;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 31/12/16.
 */
@Component
@Data
@ConfigurationProperties(prefix = "graphite")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GraphiteConfig {
  String host;
  Integer port;
  String prefix;
  boolean enabled;
}
