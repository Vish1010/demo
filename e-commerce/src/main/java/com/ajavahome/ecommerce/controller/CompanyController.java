package com.ajavahome.ecommerce.controller;

import com.ajavahome.ecommerce.dto.request.SignUpRequest;
import com.ajavahome.ecommerce.dto.response.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public interface CompanyController {

    @RequestMapping(value="/v1/company/signup",method = RequestMethod.POST)
    @ResponseBody
    Response signup(@RequestBody SignUpRequest signUpRequest);

 0
}
