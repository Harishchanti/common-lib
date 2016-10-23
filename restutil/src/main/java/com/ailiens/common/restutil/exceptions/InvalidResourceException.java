package com.ailiens.common.restutil.exceptions;

/**
 * Created by jayant on 15/10/16.
 */
public class InvalidResourceException extends GenericServiceException {

    public InvalidResourceException()
    {
        super("InvalidResourceException: Got 404 Response",404);
    }

    public InvalidResourceException(String message)
    {
        super(message,404);
    }
}
