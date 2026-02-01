package com.multivendor.ecommerce.model;

import com.multivendor.ecommerce.domain.AccountStatus;
import com.multivendor.ecommerce.domain.USER_ROLE;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sellerName;

    private String mobile;

    private String email;

    private String password;

    private BusinessDetails businessDetails=new BusinessDetails();

    private BankDetails bankDetails=new BankDetails();

    private Address pickupAddress=new Address();

    private String GSTIN;

    private USER_ROLE role=USER_ROLE.ROLE_SELLER;

    private boolean isEmailVerified=false;

    private AccountStatus accountStatus= AccountStatus.PENDING_VERIFICATION;
}
