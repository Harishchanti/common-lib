package com.ailiens.common.model.exceptions;

/**
 * Created by akki on 4/12/15.
 */
public class WalletNotUpdatedException extends RuntimeException {
    public WalletNotUpdatedException(String message, Throwable cause) {
        super(message, cause);
    }
}
