package com.ktg.HibernateDemo.view;

import com.ktg.HibernateDemo.model.PrimaryAttribute;

public class PrimaryAttributeView {
	
	private int eventId;
	private String primaryAttrValue;
	
	

    public PrimaryAttributeView(PrimaryAttribute primaryAttribute) {
        this.eventId = primaryAttribute.getEventId();
        this.primaryAttrValue = primaryAttribute.getAttrKey();
    }
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getPrimaryAttrValue() {
		return primaryAttrValue;
	}
	public void setPrimaryAttrValue(String primaryAttrValue) {
		this.primaryAttrValue = primaryAttrValue;
	}

}
