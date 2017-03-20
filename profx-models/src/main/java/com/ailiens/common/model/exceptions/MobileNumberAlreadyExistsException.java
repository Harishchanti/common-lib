package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 26/10/15.
 */
public class MobileNumberAlreadyExistsException extends RuntimeException {

    public MobileNumberAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

}
