package com.ailiens.common.model.exceptions;

public class OtpVerifyRequestFailedException extends RuntimeException {
 public OtpVerifyRequestFailedException(String message, Throwable cause){
	 super(message, cause);
 }
}
