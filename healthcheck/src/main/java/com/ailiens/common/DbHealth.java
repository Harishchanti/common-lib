package com.ailiens.common;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static com.ailiens.common.Constants.HEALTH_SUCCESS;

/**
 * Created by jayant on 7/4/17.
 */

@Component
@ConditionalOnProperty(name = "healthcheck.mysql", havingValue = "true")
public class DbHealth implements HealthCheck {

    @PersistenceContext
    EntityManager entityManager;

    @PostConstruct
    public  void info()
    {
        System.out.println("DbHealth initialized");
    }

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
