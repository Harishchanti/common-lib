package com.ailiens.common.model.exceptions;

/**
 * Created by akki on 4/12/15.
 */
public class WalletNotFoundException extends RuntimeException {
    public WalletNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
