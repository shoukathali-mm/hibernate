package com.ktg.HibernateDemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktg.HibernateDemo.model.Location;
import com.ktg.HibernateDemo.repositories.LocationRepository;

@Service
public class LocationService {
	
	
	@Autowired
	private LocationRepository locationRepository; 

	public List<Location> findAll() {
		return (List<Location>) locationRepository.findAll();
	}

	public Optional<Location> findById(Integer id) {
		return locationRepository.findById(id);
	}
	
	public void addLocation(Location location)
	{
		locationRepository.save(location);
	}

}
