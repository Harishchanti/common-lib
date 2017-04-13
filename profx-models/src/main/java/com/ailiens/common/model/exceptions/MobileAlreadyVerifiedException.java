package com.ailiens.common.model.exceptions;

public class MobileAlreadyVerifiedException extends RuntimeException {
	public MobileAlreadyVerifiedException(String message, Throwable cause){
		super(message, cause);
	}

}
