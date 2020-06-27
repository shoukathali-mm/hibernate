package com.ktg.HibernateDemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktg.HibernateDemo.form.AttributeMapping;
import com.ktg.HibernateDemo.form.PrimaryAttributeForm;
import com.ktg.HibernateDemo.form.SecondaryMapping;
import com.ktg.HibernateDemo.services.AttributeService;
import com.ktg.HibernateDemo.view.BasicResponseView;
import com.ktg.HibernateDemo.view.PrimaryAttributeView;
import com.ktg.HibernateDemo.view.SecondaryAttributeView;


@RestController
@RequestMapping("events/{eventId}")
public class AttributeController {
	
	@Autowired
    AttributeService attributeService;

	@PutMapping("primary-filter")
	public PrimaryAttributeView updatePrimaryFilter(@PathVariable Integer eventId,
			@RequestBody @Valid PrimaryAttributeForm primaryAttributeForm) {
		
		
		
		
		return attributeService.updatePrimaryFilter(eventId, primaryAttributeForm);

	}
	
	
	 @PutMapping("secondary-filter")
	public List<SecondaryAttributeView> updateSecondoryFilter(@PathVariable Integer eventId,
            @RequestBody @Valid SecondaryMapping secondaryMapping)
	{
		return attributeService.updateSecondaryFilter(eventId, secondaryMapping);
		
	}
	 
	  @PutMapping("attribute-values")
	    public BasicResponseView updateAttributeValues(@PathVariable Integer eventId,
	                                                @RequestBody @Valid AttributeMapping attributeMapping) {
														return attributeService.updateAttributeValues(eventId, attributeMapping);
		  
	  }
	  

}
