package com.ailiens.common;

import com.google.common.collect.Lists;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jayant on 7/4/17.
 */
@Configuration
@ConfigurationProperties(prefix = "healthCheck")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HealthCheckConfig {

    List<Service> services = Lists.newArrayList();
    String baseUrl;

    HashMap<String,Service> service = new HashMap<>();

    @PostConstruct
    public void init()
    {
       for(Map.Entry<String,Service> entry:  service.entrySet())
       {
           Service service = entry.getValue();
           service.setName(entry.getKey());
           services.add(service);
       }
    }
}
