package com.ailiens.common.restutil;


import com.ailiens.common.restutil.exceptions.GenericServiceException;
import com.ailiens.common.restutil.exceptions.InvalidInputException;
import com.ailiens.common.restutil.exceptions.InvalidResourceException;
import com.ailiens.common.restutil.exceptions.UnauthorizedAccessException;

/**
 * Created by jayant on 15/10/16.
 */
public interface CheckResponse {

    default void checkResponse(Integer status,String responseBody) throws GenericServiceException {
        switch (status) {
            case 200:
            case 201:
            case 204:
                //request successful, do nothing
            case 302:
            case 304:
            case 400:
                throw new InvalidInputException(responseBody);
            case 401:
                throw new UnauthorizedAccessException(responseBody);
            case 404:
                throw new InvalidResourceException(responseBody);
            case 422:
                throw new InvalidInputException(responseBody,status);
            default:
                throw new GenericServiceException(String.format("StatusCode: %s , Response: %s",String.valueOf(status),responseBody),status);
        }
    }

}
