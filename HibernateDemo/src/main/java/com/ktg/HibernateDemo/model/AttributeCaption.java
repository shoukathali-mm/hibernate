package com.ktg.HibernateDemo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;


@Entity
@IdClass(AttributeCaptionId.class)
public class AttributeCaption implements Serializable {
	
	    @Id
	    private int eventId;

	    @Id
	    private String attrKey;

	    private String caption;
	    
	    public AttributeCaption() {
	    }

	    public AttributeCaption(int eventId, String attrKey, String caption) {
	        this.eventId = eventId;
	        this.attrKey = attrKey;
	        this.caption = caption;
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

	    public String getCaption() {
	        return caption;
	    }

	    public void setCaption(String caption) {
	        this.caption = caption;
	    }

}
