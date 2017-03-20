package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 28/10/15.
 */
public class UnknownException extends RuntimeException {
    public UnknownException(String message, Throwable cause) {
        super(message, cause);
    }
}
