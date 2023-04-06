package com.project.wineshop.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "order_payment")
public class OrderPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Payment payment;

   public enum Payment{
        CREATED, FULFILLED
    }
}
