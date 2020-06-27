package com.ktg.HibernateDemo.services;

import java.util.List;

import com.ktg.HibernateDemo.form.AttributeMapping;
import com.ktg.HibernateDemo.form.PrimaryAttributeForm;
import com.ktg.HibernateDemo.form.SecondaryMapping;
import com.ktg.HibernateDemo.view.BasicResponseView;
import com.ktg.HibernateDemo.view.PrimaryAttributeView;
import com.ktg.HibernateDemo.view.SecondaryAttributeView;

public interface AttributeService {
	
	public PrimaryAttributeView updatePrimaryFilter(Integer eventId, PrimaryAttributeForm primaryAttributeForm);
	
	 public List<SecondaryAttributeView> updateSecondaryFilter(Integer eventId, SecondaryMapping secondaryMapping);
	 
	    public BasicResponseView updateAttributeValues(Integer eventId, AttributeMapping attributeMapping);

}
