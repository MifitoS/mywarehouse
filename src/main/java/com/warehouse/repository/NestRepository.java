package com.warehouse.repository;

import com.warehouse.model.Nest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NestRepository extends CrudRepository<Nest, Long> {


}
