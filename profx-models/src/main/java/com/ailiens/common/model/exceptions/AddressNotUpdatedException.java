package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 21/10/15.
 */
public class AddressNotUpdatedException extends RuntimeException  {
    public AddressNotUpdatedException(String message, Throwable cause) {
        super(message, cause);
    }

}
