package com.ailiens.common.model.exceptions;

/**
 * Created by akki on 4/12/15.
 */
public class WalletNotSavedException extends RuntimeException {
    public WalletNotSavedException(String message, Throwable cause) {
        super(message, cause);
    }
}
