package com.scaler.BMSApr23.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Seat seat;

    @ManyToOne
    private Show show;

    @Enumerated(EnumType.STRING)
    private ShowSeatStatus seatStatus;

    @ManyToOne
    private Ticket ticket;


}
