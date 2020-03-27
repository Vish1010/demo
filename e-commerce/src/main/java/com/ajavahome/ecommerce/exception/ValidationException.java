package com.ajavahome.ecommerce.exception;

public class ValidationException extends RuntimeException {
    private String feild;
    private String message;

    public String getFeild() {
        return feild;
    }


    public String getMessage() {
        return message;
    }

    public ValidationException(String message, String feild) {
        super(message);
        this.feild = feild;
        this.message = message;
    }
}
