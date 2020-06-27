package com.ktg.HibernateDemo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ktg.HibernateDemo.model.SecondaryAttribute;
import com.ktg.HibernateDemo.model.SecondaryAttributeId;

public interface SecondaryAttributeRepository extends CrudRepository<SecondaryAttribute, SecondaryAttributeId>{

}
