package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 21/10/15.
 */
public class AddressNotRemovedException extends RuntimeException {

    public AddressNotRemovedException(String message, Throwable cause) {
        super(message, cause);
    }
}
