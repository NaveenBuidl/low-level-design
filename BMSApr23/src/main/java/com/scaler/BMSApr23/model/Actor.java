package com.scaler.BMSApr23.model;

// I want Actor class to become a table

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity // as I want the actor to become a table
@Getter
@Setter
public class Actor extends BaseModel{
    private String name;

    // Cardinality relationship between movie and actor is M:M as 1 actor can be part of many movies,
    // and 1 movie can have many actors
    // hence add the relationship annotation below
    @ManyToMany
    private List<Movie> movies;
}


