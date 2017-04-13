package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 20/10/15.
 */
public class AccountNotRemovedException extends RuntimeException {

    public AccountNotRemovedException(String message, Throwable cause) {
        super(message, cause);
    }
}
