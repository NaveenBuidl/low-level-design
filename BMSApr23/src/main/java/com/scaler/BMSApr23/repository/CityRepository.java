package com.scaler.BMSApr23.repository;

import com.scaler.BMSApr23.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


// below method takes care of all the SQL queries
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    City save(City city); // equivalent to add/update
    Optional<City> findById(Long id); // equivalent to SELECT * FROM CITY WHERE ID = :id;
    List<City> findAllByName(String name); // equivalent to SELECT * FROM CITY WHERE NAME = :NAME;
}
