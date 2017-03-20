package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 20/10/15.
 */
public class AccountNotCreatedException extends RuntimeException {

    public AccountNotCreatedException(String message, Throwable cause) {
        super(message, cause);
    }
}
