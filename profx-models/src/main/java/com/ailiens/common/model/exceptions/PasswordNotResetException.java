package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 20/10/15.
 */
public class PasswordNotResetException extends RuntimeException {

    public PasswordNotResetException(String message, Throwable cause) {
        super(message, cause);
    }
}
