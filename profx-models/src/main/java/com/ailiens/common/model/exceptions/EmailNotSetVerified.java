package com.ailiens.common.model.exceptions;

/**
 * Created by akki on 1/12/15.
 */
public class EmailNotSetVerified extends RuntimeException {
    public EmailNotSetVerified(String message, Throwable cause) {
        super(message, cause);
    }
}
