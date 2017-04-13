package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 20/10/15.
 */
public class AccountDoesNotExistsException extends RuntimeException{

    public AccountDoesNotExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
