package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 21/10/15.
 */
public class AddressNotSavedException extends RuntimeException{
    public AddressNotSavedException(String message, Throwable cause) {
        super(message, cause);
    }

}
