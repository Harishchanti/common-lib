package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 26/10/15.
 */
public class EmailDoesnotExistsException extends RuntimeException {

    public EmailDoesnotExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
