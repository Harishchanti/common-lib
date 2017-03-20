package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 21/10/15.
 */
public class AddressDoesNotExists extends RuntimeException {
    public AddressDoesNotExists(String message, Throwable cause) {
        super(message, cause);
    }

}
