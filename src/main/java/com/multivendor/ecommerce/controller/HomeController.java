package com.multivendor.ecommerce.controller;

import com.multivendor.ecommerce.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ApiResponse HomeControllerHandler(){
        ApiResponse apiResponse=new ApiResponse();
//        apiResponse.setMessage("welcome to the multivendor ecommerce system");
        apiResponse.setMessage("Hii i am shyam, I am pushing code today");
//        return "welcome to the multivendor ecommerce system";
        return apiResponse;
    }
}
