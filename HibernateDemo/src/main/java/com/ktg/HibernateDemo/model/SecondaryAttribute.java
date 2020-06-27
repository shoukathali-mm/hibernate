package com.ktg.HibernateDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(SecondaryAttributeId.class)
public class SecondaryAttribute {
	
	    @Id
	    private int eventId;
	    @Id
	    private String attrKey;
	    @Id
	    private String primaryAttrValue;
	    
	    
		public SecondaryAttribute() {
			super();
			// TODO Auto-generated constructor stub
		}
		public SecondaryAttribute(int eventId, String attrKey, String primaryAttrValue) {
			super();
			this.eventId = eventId;
			this.attrKey = attrKey;
			this.primaryAttrValue = primaryAttrValue;
		}
		public int getEventId() {
			return eventId;
		}
		public void setEventId(int eventId) {
			this.eventId = eventId;
		}
		public String getAttrKey() {
			return attrKey;
		}
		public void setAttrKey(String attrKey) {
			this.attrKey = attrKey;
		}
		public String getPrimaryAttrValue() {
			return primaryAttrValue;
		}
		public void setPrimaryAttrValue(String primaryAttrValue) {
			this.primaryAttrValue = primaryAttrValue;
		}

}
