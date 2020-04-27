package com.ktg.HibernateDemo.controllers;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktg.HibernateDemo.form.SettingsForm;
import com.ktg.HibernateDemo.services.SettingsService;
import com.ktg.HibernateDemo.view.SettingsView;

@RestController
@RequestMapping("events/{eventId}/settings")
public class SettingsController {
	
	@Autowired
	SettingsService settingsService;
	
	@PutMapping
	public SettingsView createOrUpdateMatchmakingSettings(@RequestHeader(value="organizationId", required=true) int organizationId,
			@PathVariable @Min(value=1, message="EVENT_ID_INVALID_SIZE") int eventId,
			@Valid @RequestBody SettingsForm form) {
		
		
				return settingsService.createSettings(form, organizationId, eventId);
		
	}
	
	public SettingsView getMatchmakingSettings(
		    @RequestHeader(value = "organizationId", required = true) int organizationId,
		    @PathVariable @Min(value = 1, message = "EVENT_ID_INVALID_SIZE") int eventId)
	{
		return settingsService.getMatchmakingSettings(eventId);
		
	}

}
