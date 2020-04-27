package com.ktg.HibernateDemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ktg.HibernateDemo.model.Location;
import com.ktg.HibernateDemo.services.LocationService;

@RestController
public class LocationController {
	
	
	@Autowired
	private LocationService locationService;
		
	@GetMapping("/locations")
	public List<Location> getAllLocations() {
		return locationService.findAll();
	}
		
	@GetMapping("/locations/{id}")
	public Optional<Location> getLocationById(@PathVariable Integer id) {
		return locationService.findById(id);
	}
	
	
	@PostMapping("/location/addNew")
	public void addLocation(@RequestBody Location location)
	{
		locationService.addLocation(location);
	}
	
	

}
