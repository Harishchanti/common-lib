package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 29/10/15.
 */
public class InvalidAddressType extends RuntimeException {

    public InvalidAddressType(String message, Throwable cause) {
        super(message, cause);
    }
}
