package com.ailiens.common;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * Created by jayant on 7/4/17.
 */

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HealthCheckService {

    @Autowired
    List<HealthCheck> healthCheckList;

    HashMap<String,String> status =  new HashMap<>();

    static final String HEALTH_SUCCESS="Success";

    public ResponseEntity<?> invoke()
    {
      int statusCode=200;

        for(HealthCheck healthCheck: healthCheckList)
      {
          String healthStatus =HEALTH_SUCCESS;
          try {
              healthStatus=healthCheck.invoke();
          }
          catch (Exception e)
          {
              healthStatus= ExceptionUtils.getMessage(e);
          }

          if(healthStatus.equals(HEALTH_SUCCESS))
          {
              statusCode=500;
          }
          status.put(healthCheck.getName(),healthStatus);
      }

      return ResponseEntity.status(statusCode).body(status);
    }
}
