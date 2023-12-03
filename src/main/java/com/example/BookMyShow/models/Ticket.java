package com.example.BookMyShow.models;

import com.example.BookMyShow.models.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{

    @ManyToOne
    private Show show;

    @ManyToMany
    private List<ShowSeat> showSeats;

    private double totalAmount;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

    private LocalDateTime timeOfBooking;
}
/*
    Show    Ticket
      1        M
      1        1

      Ticket -> Show : M : 1

      Ticket        ShowSeat
         1              M       :  user can book multiple show seats with one ticket
         M              1       :  if we support cancellation, one showSeat belongs to multiple Tickets, as anyone can
                                   cancel it and someone else booked it.
 */