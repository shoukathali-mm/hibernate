package com.ktg.HibernateDemo.model;

import java.io.Serializable;

public class AttributeValueId implements Serializable{
	
	 private int eventId;
	    private String attrKey;
	    private String value;
	    
	    
	    
	    
		public AttributeValueId() {
			super();
		}
		public AttributeValueId(int eventId, String attrKey, String value) {
			super();
			this.eventId = eventId;
			this.attrKey = attrKey;
			this.value = value;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((attrKey == null) ? 0 : attrKey.hashCode());
			result = prime * result + eventId;
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AttributeValueId other = (AttributeValueId) obj;
			if (attrKey == null) {
				if (other.attrKey != null)
					return false;
			} else if (!attrKey.equals(other.attrKey))
				return false;
			if (eventId != other.eventId)
				return false;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
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
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}

}
