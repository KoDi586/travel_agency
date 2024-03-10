package com.kodi.travel_agency.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code;
    private Double amount;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "payment_date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime paymentDateTime;

    /**
     * types in view: cash, card, ...
     */
    @Column(name = "payment_type")
    private String paymentType;

    private Boolean status;


    public Payment() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getPaymentDateTime() {
        return paymentDateTime;
    }

    public void setPaymentDateTime(LocalDateTime paymentDateTime) {
        this.paymentDateTime = paymentDateTime;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(code, payment.code) && Objects.equals(amount, payment.amount) && Objects.equals(clientId, payment.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, amount, clientId);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "code='" + code + '\'' +
                ", amount=" + amount +
                ", clientId=" + clientId +
                ", paymentDateTime=" + paymentDateTime +
                ", paymentType='" + paymentType + '\'' +
                ", status=" + status +
                '}';
    }
}
