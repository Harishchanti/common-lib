package com.ailiens.common;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static com.ailiens.common.HealthCheckService.HEALTH_SUCCESS;

/**
 * Created by jayant on 7/4/17.
 */

@Component
public class DbHealth implements HealthCheck {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public String invoke() throws Exception {
        entityManager.createNativeQuery("select 1");
        return HEALTH_SUCCESS;
    }

    @Override
    public String getName() {
        return "DB";
    }
}
