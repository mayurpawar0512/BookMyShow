package com.example.BookMyShow.models;

import com.example.BookMyShow.models.enums.PaymentMethod;
import com.example.BookMyShow.models.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplicationRunListener;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{

    private LocalDateTime paymentTime;

    private double amount;

    private String referenceId;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @ManyToOne
    private Ticket ticket;
}
/*
    Ticket Payment
       1      M         : Failed payments can be there
       1      1         : for 1 payment you can get only one ticket
 */