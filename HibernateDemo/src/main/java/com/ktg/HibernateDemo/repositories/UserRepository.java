package com.ktg.HibernateDemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ktg.HibernateDemo.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
