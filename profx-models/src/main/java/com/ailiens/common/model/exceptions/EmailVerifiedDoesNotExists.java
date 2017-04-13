package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 27/10/15.
 */
public class EmailVerifiedDoesNotExists extends RuntimeException {

    public EmailVerifiedDoesNotExists(String message, Throwable cause) {
        super(message, cause);
    }
}
