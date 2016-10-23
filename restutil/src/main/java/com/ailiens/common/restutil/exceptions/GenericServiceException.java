package com.ailiens.common.restutil.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jayant on 15/10/16.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GenericServiceException extends RuntimeException {
  private String message;
    private int status;

    public GenericServiceException(int status)
    {
        this.status=status;
        this.message="Got Response "+String.valueOf(status);
    }
}
