package com.ktg.HibernateDemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ktg.HibernateDemo.model.PrimaryAttribute;

@Repository
public interface PrimaryAttributeRepository extends CrudRepository<PrimaryAttribute, Integer>{

}
