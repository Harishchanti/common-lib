package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 20/10/15.
 */
public class SettingsNotFound extends RuntimeException {
    public SettingsNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
