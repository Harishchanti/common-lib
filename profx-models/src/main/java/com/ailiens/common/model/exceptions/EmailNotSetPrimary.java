package com.ailiens.common.model.exceptions;

/**
 * Created by akki on 1/12/15.
 */
public class EmailNotSetPrimary extends RuntimeException {
    public EmailNotSetPrimary(String message, Throwable cause) {
        super(message, cause);
    }
}
