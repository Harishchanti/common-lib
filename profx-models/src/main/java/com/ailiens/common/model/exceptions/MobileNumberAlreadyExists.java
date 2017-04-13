package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 27/10/15.
 */
public class MobileNumberAlreadyExists extends RuntimeException {

    public MobileNumberAlreadyExists(String message, Throwable cause) {
        super(message, cause);
    }
}
