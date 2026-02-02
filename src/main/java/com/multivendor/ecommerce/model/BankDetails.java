package com.multivendor.ecommerce.model;

import jakarta.persistence.Embeddable;
//import jakarta.persistence.Embedded;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Embeddable
public class BankDetails {
    private String accountNumber;
    private String accountHolderName;
//    private String bankName;
    private String ifscCode;
}

