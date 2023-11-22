package com.scaler.BMSApr23.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter

public class Payment extends BaseModel{
    private double amount;
    private Date timestamp;
    private String transactionNo;

//    Element collection not added as it is for many to many mapping
//    @ElementCollection
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @OneToOne
    private Ticket ticket;


}

// Payment : PaymentStatus : -> M : 1
// Payment : Ticket : -> 1 : 1 // it is not about seats but ticket, as a ticket contains seats
// 3rd party will do multi-part payment

