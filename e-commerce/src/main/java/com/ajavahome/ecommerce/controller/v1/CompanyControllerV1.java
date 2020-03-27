package com.ajavahome.ecommerce.controller.v1;

import com.ajavahome.ecommerce.controller.CompanyController;
import com.ajavahome.ecommerce.dto.request.SignUpRequest;
import com.ajavahome.ecommerce.dto.response.Response;
import com.ajavahome.ecommerce.exception.ValidationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CompanyControllerV1 implements CompanyController {

    @Override
    public @ResponseBody
    Response signup(@RequestBody SignUpRequest signUpRequest) {

        String companyName=signUpRequest.getCompanyName();
        if(companyName==null){
            throw new ValidationException("Comapny Name Required","companyName");
        }
        return null;
    }
}
