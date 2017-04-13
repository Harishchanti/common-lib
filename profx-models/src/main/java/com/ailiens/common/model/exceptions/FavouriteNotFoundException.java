package com.ailiens.common.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by anagha on 1/18/17.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class FavouriteNotFoundException extends RuntimeException {
    public FavouriteNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}


