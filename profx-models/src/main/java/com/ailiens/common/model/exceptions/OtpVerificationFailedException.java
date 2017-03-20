package com.ailiens.common.model.exceptions;

public class OtpVerificationFailedException extends RuntimeException {

	public OtpVerificationFailedException(String message, Throwable cause){
		super(message,cause);

	}
}
