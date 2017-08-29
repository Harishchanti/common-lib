package com.ailiens.optimusprime.autobots.rest.dto;

public class CustomResponseDTO {

    private Boolean status;

    private String message;

    private Object response;

    private CustomErrorResponseDTO errors;

    public CustomResponseDTO(Boolean status, CustomErrorResponseDTO errors) {
        this.status = status;
        this.errors = errors;
    }

    public CustomResponseDTO(Boolean status, String message, Object response) {
        this.status = status;
        this.message = message;
        this.response = response;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public CustomErrorResponseDTO getErrors() {
        return errors;
    }

    public void setErrors(CustomErrorResponseDTO errors) {
        this.errors = errors;
    }
}
