package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 20/10/15.
 */
public class SettingsNotSaved extends RuntimeException{

    public SettingsNotSaved(String message, Throwable cause) {
        super(message, cause);
    }
}
