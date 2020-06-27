package com.ktg.HibernateDemo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrimaryAttribute implements Serializable{
	
	    @Id
	    private int eventId;
	    private String attrKey;
	    
	    
	    
	    
	    public PrimaryAttribute() {
			super();
			// TODO Auto-generated constructor stub
		}


		public PrimaryAttribute(int eventId, String attrKey) {
			super();
			this.eventId = eventId;
			this.attrKey = attrKey;
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
		

}
