package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 29/10/15.
 */
public class AddressNotFound extends RuntimeException {


    public AddressNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
