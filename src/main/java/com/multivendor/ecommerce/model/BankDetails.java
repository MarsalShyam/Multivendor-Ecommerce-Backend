package com.multivendor.ecommerce.model;

import jakarta.persistence.Embedded;
import lombok.Data;

@Data
public class BankDetails {
    private String accountNumber;
    private String accountHolderName;
//    private String bankName;
    private String ifscCode;
}

