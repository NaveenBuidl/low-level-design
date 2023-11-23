package com.scaler.BMSApr23.controller;

import com.scaler.BMSApr23.model.City;
import com.scaler.BMSApr23.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;

public class CityController {

    private CityService cityService;

    @Autowired // does the dependency injection
//  Autowired takes care of creating the object for a service
//  and then while creating object for controller
//  it will inject the object of service inside the controller
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    public City addCity(String name) {
        return cityService.addCity(name);
    }



}
