package com.ktg.HibernateDemo.view;

import java.util.Set;

public class SecondaryAttributeView {
	
	private Integer eventId;
	private String primaryAttrValue;
	private Set<String> secondoryAttrKeys;
	
	
	public SecondaryAttributeView(Integer eventId, String primaryAttrValue, Set<String> secondoryAttrKeys) {
		super();
		this.eventId = eventId;
		this.primaryAttrValue = primaryAttrValue;
		this.secondoryAttrKeys = secondoryAttrKeys;
	}
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public String getPrimaryAttrValue() {
		return primaryAttrValue;
	}
	public void setPrimaryAttrValue(String primaryAttrValue) {
		this.primaryAttrValue = primaryAttrValue;
	}
	public Set<String> getSecondoryAttrKeys() {
		return secondoryAttrKeys;
	}
	public void setSecondoryAttrKeys(Set<String> secondoryAttrKeys) {
		this.secondoryAttrKeys = secondoryAttrKeys;
	}
	
	

}
