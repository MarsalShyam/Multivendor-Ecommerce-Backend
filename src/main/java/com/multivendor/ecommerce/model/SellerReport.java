package com.multivendor.ecommerce.model;

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
//@EqualsAndHashCode
public class SellerReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long totalEarning=0L;
    private Long totalSales=0L;
    private Long totalRefunds=0L;
    private Long totalTax=0L;
    private Long netEarning=0L;

    private Integer totalOrders=0;
    private Integer canceledOrders=0;
    private Integer totalTransaction=0;

}
