package com.ktg.HibernateDemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ktg.HibernateDemo.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer>{

}
