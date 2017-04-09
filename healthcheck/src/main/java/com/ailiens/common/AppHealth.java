package com.ailiens.common;

import org.springframework.stereotype.Component;

import static com.ailiens.common.HealthCheckService.HEALTH_SUCCESS;

/**
 * Created by jayant on 7/4/17.
 */

@Component
public class AppHealth implements HealthCheck {

    @Override
    public String invoke() throws Exception {
        return HEALTH_SUCCESS;
    }

    @Override
    public String getName() {
        return "App";
    }
}
