package com.ajavahome.ecommerce.dto.response;

public class ValidationError {

    private String feild;
    private String message;

    public String getFeild() {
        return feild;
    }

    public String getMessage() {
        return message;
    }

    public ValidationError(String feild, String message) {
        this.feild = feild;
        this.message = message;
    }
}
