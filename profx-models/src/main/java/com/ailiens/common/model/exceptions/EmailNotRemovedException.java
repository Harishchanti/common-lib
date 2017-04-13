package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 26/10/15.
 */
public class EmailNotRemovedException extends RuntimeException {
    public EmailNotRemovedException(String message, Throwable cause) {
        super(message, cause);
    }
}
