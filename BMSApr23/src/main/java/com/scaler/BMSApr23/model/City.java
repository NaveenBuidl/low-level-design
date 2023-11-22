package com.scaler.BMSApr23.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class City extends BaseModel{
    private String name;

//    A city will have theatres eg PVR Forum Koramangala
//    Relationship is one-to-many
    @OneToMany
    private List<Theatre> theatres;
}


