package com.scaler.BMSApr23.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass // as below is a base model
@Getter
@Setter
public class BaseModel {
    @Id // telling this attribute is the id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // here is the strategy of id generation
    private Long id;



    // multiple attributes will require multiple getters and setters
    // lombok package gives us annotations for plain vanilla getters and setters
    // we get very clean code and the final compiled code will have getters and setters
    // annotations are basically decorator design patterns
    /*
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    */
}
