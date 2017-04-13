package com.ailiens.common;

/**
 * Created by jayant on 7/4/17.
 */
public interface HealthCheck {

    String invoke() throws Exception;
    String getName();
}
