package com.ktg.HibernateDemo.view;

import com.ktg.HibernateDemo.model.MeetingSpot;
import com.ktg.HibernateDemo.util.EnumUtil;

public class MeetingSpotView {
	
	   private final Integer spotId;
	    private final String refId;
	    private final String title;
	    private final Integer eventId;
	    private final Integer capacity;
	    private final String status;
	    private final Long createDate;
	    private final Long updateDate;
	    
	    public MeetingSpotView(MeetingSpot spot) {
	        this.spotId = spot.getSpotId();
	        this.refId = spot.getRefId();
	        this.title = spot.getTitle();
	        this.eventId = spot.getEventId();
	        this.capacity = spot.getCapacity();
	        this.status = EnumUtil.getStringFromEnum(spot.getStatus());
	        this.createDate = spot.getCreateDate() != null? spot.getCreateDate().getTime(): null;
	        this.updateDate = spot.getUpdateDate() != null? spot.getUpdateDate().getTime(): null;
	    }

		public Integer getSpotId() {
			return spotId;
		}
		public String getRefId() {
			return refId;
		}
		public String getTitle() {
			return title;
		}
		public Integer getEventId() {
			return eventId;
		}
		public Integer getCapacity() {
			return capacity;
		}
		public String getStatus() {
			return status;
		}
		public Long getCreateDate() {
			return createDate;
		}
		public Long getUpdateDate() {
			return updateDate;
		}

}
