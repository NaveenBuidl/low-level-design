package com.scaler.BMSApr23.service;

import com.scaler.BMSApr23.model.City;
import com.scaler.BMSApr23.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

//    From controller got the name of the city
//    new city created
//    and then sent to repository to save
    public City addCity(String name) {
        City newCity = new City();
        newCity.setName(name);
        return cityRepository.save(newCity);
    }
}
