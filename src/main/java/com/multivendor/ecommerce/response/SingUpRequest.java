package com.multivendor.ecommerce.response;

import lombok.Data;

@Data
public class SingUpRequest {
    private String email;
    private String fullName;
    private String otp;
}
