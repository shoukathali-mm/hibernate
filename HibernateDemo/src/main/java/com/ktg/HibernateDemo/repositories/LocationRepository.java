package com.ktg.HibernateDemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ktg.HibernateDemo.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer>{

}
