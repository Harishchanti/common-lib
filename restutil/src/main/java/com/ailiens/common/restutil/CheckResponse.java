package com.ailiens.common.restutil;


import com.ailiens.common.restutil.exceptions.GenericServiceException;
import com.ailiens.common.restutil.exceptions.InvalidInputException;
import com.ailiens.common.restutil.exceptions.InvalidResourceException;
import com.ailiens.common.restutil.exceptions.UnauthorizedAccessException;

/**
 * Created by jayant on 15/10/16.
 */
public interface CheckResponse {

    default void checkResponse(Integer status) throws GenericServiceException {
        switch (status) {
            case 200:
            case 201:
            case 204:
                //request successful, do nothing
                break;
            case 400:
                throw new InvalidInputException();
            case 401:
                throw new UnauthorizedAccessException();
            case 404:
                throw new InvalidResourceException();
            case 422:
                throw new InvalidInputException(status);
            default:
                throw new GenericServiceException(status);
        }
    }

}
