package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 26/10/15.
 */
public class EmailNotSavedException extends RuntimeException {
    public EmailNotSavedException(String message, Throwable cause) {
        super(message, cause);
    }
}

