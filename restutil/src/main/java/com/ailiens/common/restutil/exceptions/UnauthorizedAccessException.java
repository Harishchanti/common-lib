package com.ailiens.common.restutil.exceptions;

/**
 * Created by jayant on 15/10/16.
 */
public class UnauthorizedAccessException extends GenericServiceException {

    public UnauthorizedAccessException()
    {
        super("UnauthorizedAccessException: Got 401 Response",401);
    }

    public UnauthorizedAccessException(String message)
    {
        super(message,401);
    }
}
