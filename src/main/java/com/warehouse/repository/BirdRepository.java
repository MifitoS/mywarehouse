package com.warehouse.repository;

import com.warehouse.model.Bird;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepository extends CrudRepository<Bird, Long> {

    //Напоминалка Bird: ctrl+ пробел

    @Query(value = "select count(distinct (bird_species)) from bird", nativeQuery = true)
    Long getUniqueBirdSpecies();
}
