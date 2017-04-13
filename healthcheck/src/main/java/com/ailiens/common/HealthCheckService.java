package com.ailiens.common;

import com.google.common.collect.Lists;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.inject.Singleton;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static com.ailiens.common.Constants.HEALTH_SUCCESS;

/**
 * Created by jayant on 7/4/17.
 */

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
@Singleton
public class HealthCheckService {

    @Autowired(required = false)
    List<HealthCheck> healthCheckList = Lists.newArrayList();

    @Autowired
    HealthCheckConfig healthCheckConfig;



    private void pingHost(String host, int port, int timeout) throws IOException {
        Socket socket = new Socket();

        try {
            socket.connect(new InetSocketAddress(host, port), timeout);
        }
        catch (IOException e)
        {
            throw  e;
        }finally {
            socket.close();
        }
    }


    private HttpStatus getStatusCode(HashMap<String,String> status)
    {
        Optional<String> failedHealth= status.values()
            .stream()
            .filter(str-> !str.equals(HEALTH_SUCCESS))
            .findAny();

        if(failedHealth.isPresent())
            return HttpStatus.INTERNAL_SERVER_ERROR;

        return HttpStatus.OK;
    }

    public ResponseEntity<?> invoke()
    {

        HashMap<String,String> status =  new HashMap<>();

        for(HealthCheck healthCheck: healthCheckList)
      {
          String healthStatus;
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
            }catch (IOException e)
            {
                healthStatus = ExceptionUtils.getMessage(e);
            }
            status.put(service.getName(),healthStatus);
        }


       HttpStatus httpStatus= getStatusCode(status);

        return ResponseEntity.status(httpStatus).body(status);
    }
}
