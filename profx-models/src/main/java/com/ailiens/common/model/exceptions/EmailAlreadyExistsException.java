package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 26/10/15.
 */
public class EmailAlreadyExistsException extends RuntimeException {

    public EmailAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

}
