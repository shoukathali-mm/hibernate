package com.ktg.HibernateDemo.form;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MeetingSpotForm implements Serializable{
	
	
	@Size(max = 20, message = "SPOT_REF_ID_INVALID_SIZE")
    private String refId;
    @Size(min = 1, max = 100, message = "SPOT_TITLE_INVALID_SIZE")
    @NotNull(message = "SPOT_TITLE_MUST_NOT_BE_NULL")
    private String title;
    @Max(value = Integer.MAX_VALUE, message = "SPOT_CAPACITY_INVALID")
    private Integer capacity;
    
    
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
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}


}
