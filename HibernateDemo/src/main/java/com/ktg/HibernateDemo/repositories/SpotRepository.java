package com.ktg.HibernateDemo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ktg.HibernateDemo.enums.Status;
import com.ktg.HibernateDemo.model.MeetingSpot;

@Repository
public interface SpotRepository extends CrudRepository<MeetingSpot, Integer>{
	
	
	Optional<MeetingSpot> findBySpotIdAndEventIdAndStatusNot(Integer spotId, Integer eventId, Status status);

}
