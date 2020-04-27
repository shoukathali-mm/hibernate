package com.ktg.HibernateDemo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.ktg.HibernateDemo.enums.Status;

@Entity
	public class MatchmakingSlot implements Serializable {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer slotId;
	    private Integer eventId;
	    private Integer startTime;
	    private Integer endTime;
	    private Integer slotDay;
	    @Enumerated(EnumType.ORDINAL)
	    private Status status;
	    @CreationTimestamp
	    private Date createDate;
	    @UpdateTimestamp
	    private Date updateDate;
	    
	    
	    public MatchmakingSlot() {
	    }

	    public MatchmakingSlot(Integer eventId, Integer startTime, Integer endTime, Integer day) {
	        this.eventId = eventId;
	        this.startTime = startTime;
	        this.endTime = endTime;
	        this.slotDay = day;
	        this.status = Status.ACTIVE;
	    }

	    
	    
		public Integer getSlotId() {
			return slotId;
		}
		public void setSlotId(Integer slotId) {
			this.slotId = slotId;
		}
		public Integer getEventId() {
			return eventId;
		}
		public void setEventId(Integer eventId) {
			this.eventId = eventId;
		}
		public Integer getStartTime() {
			return startTime;
		}
		public void setStartTime(Integer startTime) {
			this.startTime = startTime;
		}
		public Integer getEndTime() {
			return endTime;
		}
		public void setEndTime(Integer endTime) {
			this.endTime = endTime;
		}
		public Integer getSlotDay() {
			return slotDay;
		}
		public void setSlotDay(Integer slotDay) {
			this.slotDay = slotDay;
		}
		public Status getStatus() {
			return status;
		}
		public void setStatus(Status status) {
			this.status = status;
		}
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
		public Date getUpdateDate() {
			return updateDate;
		}
		public void setUpdateDate(Date updateDate) {
			this.updateDate = updateDate;
		}

}
