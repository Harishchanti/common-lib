package com.ailiens.common.model.exceptions;

public class UserNotAuthorizedException extends RuntimeException {
	  public UserNotAuthorizedException(String message, Throwable cause) {
	        super(message, cause);
	    }

}
