package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 27/10/15.
 */
public class NeftAccountNumberAlreadyExists extends RuntimeException {

    public NeftAccountNumberAlreadyExists(String message, Throwable cause) {
        super(message, cause);
    }
}
