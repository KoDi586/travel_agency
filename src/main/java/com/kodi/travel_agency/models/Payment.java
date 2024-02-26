package com.kodi.travel_agency.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code;
    private Double amount;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "payment_date", columnDefinition = "DATE")
    private LocalDate paymentDate;

    @Column(name = "payment_type")
    private String paymentType;

    private Boolean status;

}
