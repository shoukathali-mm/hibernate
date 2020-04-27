package com.ktg.HibernateDemo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktg.HibernateDemo.form.MeetingSpotForm;
import com.ktg.HibernateDemo.services.MeetingSpotService;
import com.ktg.HibernateDemo.view.MeetingSpotView;

@RestController
@RequestMapping("events/{eventId}/spots")
public class SpotController {
	
	
	@Autowired
	MeetingSpotService meetingSpotService;
	
	@PostMapping
	public MeetingSpotView createMeetingSpot(
			@RequestHeader(value = "organizationId") int organizationId,
			@PathVariable Integer eventId,
			@RequestBody @Valid MeetingSpotForm form)
	{
		
		
		return meetingSpotService.createMeetingSpot(eventId, form);
		
	}
	
	
	@DeleteMapping("{spotId}")
    public boolean deleteMeetingSpot(
            @RequestHeader(value = "organizationId") int organizationId,
            @PathVariable Integer eventId,
            @PathVariable Integer spotId) {
     
        return meetingSpotService.deleteMeetingSpot(eventId, spotId);
    }

}
