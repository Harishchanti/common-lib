package com.ailiens.common;

import com.google.common.collect.Lists;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jayant on 7/4/17.
 */

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HealthCheckService {

    @Autowired(required = false)
    List<HealthCheck> healthCheckList = Lists.newArrayList();

    @Autowired
    HealthCheckConfig healthCheckConfig;

    HashMap<String,String> status =  new HashMap<>();

    public static final String HEALTH_SUCCESS="OK";



    public void pingHost(String host, int port, int timeout) throws IOException {

        Socket socket = new Socket();
        try {

            socket.connect(new InetSocketAddress(host, port), timeout);
        }catch (Exception e)
        {
            throw  e;

        }finally {
            socket.close();
        }

    }

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


          status.put(healthCheck.getName(),healthStatus);
      }

        List<Service> serviceList = healthCheckConfig.getServices();

        for(Service service : serviceList)
        {
            String healthStatus=HEALTH_SUCCESS;
            try {
                pingHost(service.getHost(), service.getPort(), service.getTimeout());
            }catch (Exception e)
            {
                healthStatus = ExceptionUtils.getMessage(e);
            }
            status.put(service.getName(),healthStatus);
        }


        for(String str: status.values())
        {

            if(!str.equals(HEALTH_SUCCESS))
            {
              statusCode=500;
            }
        }



      return ResponseEntity.status(statusCode).body(status);
    }
}
