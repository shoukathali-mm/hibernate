package com.ktg.HibernateDemo.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ktg.HibernateDemo.model.Tag;


@Repository
public interface TagRepository extends CrudRepository<Tag, Integer>{

	List<Tag> findByValue(String tagValue);

	List<Tag> findByValueContaining(String trim, Pageable pageable);

}
