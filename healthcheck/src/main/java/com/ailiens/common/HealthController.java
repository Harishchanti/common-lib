package com.ailiens.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jayant on 7/4/17.
 */


@RestController
@RequestMapping("/abcd")
public class HealthController {

    @Autowired
    HealthCheckService healthCheckService;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> showHealth() throws Exception {
        return healthCheckService.invoke();
    }
}
