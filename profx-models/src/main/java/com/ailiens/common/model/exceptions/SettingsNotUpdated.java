package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 20/10/15.
 */
public class SettingsNotUpdated extends RuntimeException{

    public SettingsNotUpdated(String message, Throwable cause) {
        super(message, cause);
    }
}
