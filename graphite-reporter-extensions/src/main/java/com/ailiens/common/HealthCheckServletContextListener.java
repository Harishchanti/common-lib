package com.ailiens.common;

import com.codahale.metrics.health.HealthCheck;
import com.codahale.metrics.health.HealthCheckRegistry;
import com.codahale.metrics.servlets.HealthCheckServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.annotation.WebListener;

/**
 * Created by jayant on 1/1/17.
 */
@Component
@WebListener
public class HealthCheckServletContextListener extends HealthCheckServlet.ContextListener {

    @Autowired
    HealthCheckRegistry healthCheckRegistry;

    protected HealthCheckRegistry getHealthCheckRegistry() {
        return healthCheckRegistry;
    }

    @PostConstruct
    public void registerHealthCheck()
    {
        healthCheckRegistry.register("application", new HealthCheck() {
            @Override
            protected Result check() throws Exception {
                return Result.healthy();
            }
        });
    }
}
