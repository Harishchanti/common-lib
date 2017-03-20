package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 27/10/15.
 */
public class EmailPrimaryDoesNotExists extends RuntimeException {

    public EmailPrimaryDoesNotExists(String message, Throwable cause) {
        super(message, cause);
    }
}
