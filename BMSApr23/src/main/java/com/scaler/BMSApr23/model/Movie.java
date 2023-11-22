package com.scaler.BMSApr23.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Movie extends BaseModel {
    private String name;
    private String description;
    private int length;
    private double rating;
    private Date releaseDate;

    //    Movie : Shows -> 1: M
    @OneToMany
    private List<Show> shows;

    //    Movie : Actors -> M : M
    @ManyToMany
    private List<Actor> actors;

    // relationship properties of movie with languages is M:M
    // but languages is an enum
    @ElementCollection
    @Enumerated(EnumType.STRING)
    // above creates an enum for table with many to many mapping
    private List<Language> languages;

    // relationship properties of movie with features is M:M
    // but features is an enum
    @ElementCollection
    @Enumerated(EnumType.STRING)
    // above creates an enum for table with many to many mapping
    private List<Feature> movieFeatures;


//   now coming to relationships
//    Movie : Shows -> 1: M
//    Movie : Actors -> M : M
//    Movie : Language -> M : M
//    Movie : Features -> M: M

}
