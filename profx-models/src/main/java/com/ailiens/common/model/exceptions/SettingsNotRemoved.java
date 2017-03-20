package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 30/10/15.
 */
public class SettingsNotRemoved extends RuntimeException  {

    public SettingsNotRemoved(String message, Throwable cause) {
        super(message, cause);
    }
}
