package com.multivendor.ecommerce.model;

import com.multivendor.ecommerce.domain.PaymentStatus;
import lombok.Data;

@Data
public class PaymentDetails {
    private String PaymentId;
    private String razorpayPaymentLinkId;
    private String razorpayPaymentLinkReferenceId;
    private String razorpayPaymentLinkStatus;
    private String razorpayPaymentId;

    private PaymentStatus status;
}
