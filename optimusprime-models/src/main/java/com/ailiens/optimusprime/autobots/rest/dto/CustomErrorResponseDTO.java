package com.ailiens.optimusprime.autobots.rest.dto;

public class CustomErrorResponseDTO {

    private String errorService;

    private Class errorClass;

    private String errorCode;

    private String errorMessage;

    public CustomErrorResponseDTO(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public CustomErrorResponseDTO(String errorService, Class errorClass, String errorCode, String errorMessage) {
        this.errorService = errorService;
        this.errorClass = errorClass;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorService() {
        return errorService;
    }

    public void setErrorService(String errorService) {
        this.errorService = errorService;
    }

    public Class getErrorClass() {
        return errorClass;
    }

    public void setErrorClass(Class errorClass) {
        this.errorClass = errorClass;
    }
}
