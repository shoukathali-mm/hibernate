package com.ktg.HibernateDemo.model;

import java.io.Serializable;

public class SecondaryAttributeId implements Serializable {
	
	    private int eventId;
	    private String attrKey;
	    private String primaryAttrValue;
	    
	    
	    
	    
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((attrKey == null) ? 0 : attrKey.hashCode());
			result = prime * result + eventId;
			result = prime * result + ((primaryAttrValue == null) ? 0 : primaryAttrValue.hashCode());
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
			SecondaryAttributeId other = (SecondaryAttributeId) obj;
			if (attrKey == null) {
				if (other.attrKey != null)
					return false;
			} else if (!attrKey.equals(other.attrKey))
				return false;
			if (eventId != other.eventId)
				return false;
			if (primaryAttrValue == null) {
				if (other.primaryAttrValue != null)
					return false;
			} else if (!primaryAttrValue.equals(other.primaryAttrValue))
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
		public String getPrimaryAttrValue() {
			return primaryAttrValue;
		}
		public void setPrimaryAttrValue(String primaryAttrValue) {
			this.primaryAttrValue = primaryAttrValue;
		}

}
