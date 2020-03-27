package com.ajavahome.ecommerce.controller.v1;

import com.ajavahome.ecommerce.dto.response.ValidationError;
import com.ajavahome.ecommerce.exception.ValidationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(ValidationException.class)
    public @ResponseBody ValidationError handleValidationException(ValidationException validationException, HttpServletResponse httpServletResponse){

        ValidationError validationError=new ValidationError(validationException.getFeild(),validationException.getMessage());
        httpServletResponse.setStatus(httpServletResponse.SC_BAD_REQUEST);

        return validationError;
    }
}
