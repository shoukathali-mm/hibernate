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
import com.ktg.HibernateDemo.form.MeetingSpotForm;


@Entity
public class MeetingSpot implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer spotId;
	private String refId;
	private String title;
	private Integer eventId;
	private Integer capacity;
	@Enumerated(EnumType.ORDINAL)
	private Status status;
	@CreationTimestamp
	private Date createDate;
	@UpdateTimestamp
	private Date updateDate;
	
	
	public MeetingSpot(Integer eventId, MeetingSpotForm form) {
        this.refId = form.getRefId();
        this.title = form.getTitle();
        this.eventId = eventId;
        this.capacity = form.getCapacity();
        this.status = Status.ACTIVE;
    }

	public MeetingSpot() {
		super();
	}

	public Integer getSpotId() {
		return spotId;
	}

	public void setSpotId(Integer spotId) {
		this.spotId = spotId;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
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
