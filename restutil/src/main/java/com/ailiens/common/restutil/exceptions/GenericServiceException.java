package com.ailiens.common.restutil.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Created by jayant on 15/10/16.
 */
@AllArgsConstructor
@NoArgsConstructor
public class GenericServiceException extends RuntimeException {
  String message;
    int status;

    public GenericServiceException(int status)
    {
        this.status=status;
        this.message="Got Response "+String.valueOf(status);
    }
}
