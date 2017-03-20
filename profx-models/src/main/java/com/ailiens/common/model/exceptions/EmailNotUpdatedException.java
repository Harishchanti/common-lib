package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 26/10/15.
 */
public class EmailNotUpdatedException extends RuntimeException {


    public EmailNotUpdatedException(String message, Throwable cause) {
        super(message, cause);
    }
}
