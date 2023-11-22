package com.scaler.BMSApr23.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel{
    private String name;

    // relationship properties of auditorium with features is M:M
    // but features is an enum
    @ElementCollection
    @Enumerated(EnumType.STRING)
    // above creates an enum for table with many to many mapping
    private List<Feature> auditoriumFeatures;

    // relationship properties of auditorium to seats is 1:M
    @OneToMany
    private List<Seat> seats;

    // relationship properties of auditorium to theatre is M:1
    @ManyToOne
    private Theatre theatre;
}






