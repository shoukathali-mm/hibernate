package com.ktg.HibernateDemo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktg.HibernateDemo.form.SlotForm;
import com.ktg.HibernateDemo.services.MatchmakingSlotService;

@RestController
@RequestMapping("events/{eventId}/slots")
public class SlotController {
	
	
	  @Autowired
	  MatchmakingSlotService slotService;
	  
	  
	   @PostMapping
	    public Integer createSlot(@RequestHeader(name = "organizationId") int organizationId,
	            @PathVariable Integer eventId, @RequestBody @Valid SlotForm form) {
	      

	        return slotService.createSlot(eventId, form);
	    }

}
