package com.ktg.HibernateDemo.model;

import java.io.Serializable;

public class AttributeCaptionId implements Serializable {
	
	    private int eventId;
	    
		private String attrKey;
		
		
	    @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((attrKey == null) ? 0 : attrKey.hashCode());
			result = prime * result + eventId;
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
			AttributeCaptionId other = (AttributeCaptionId) obj;
			if (attrKey == null) {
				if (other.attrKey != null)
					return false;
			} else if (!attrKey.equals(other.attrKey))
				return false;
			if (eventId != other.eventId)
				return false;
			return true;
		}
	
	    
	    
	    
	    
		public AttributeCaptionId() {
			super();
			// TODO Auto-generated constructor stub
		}
		public AttributeCaptionId(int eventId, String attrKey) {
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
