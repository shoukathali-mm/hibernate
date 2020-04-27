package com.ktg.HibernateDemo.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class SlotForm {
	
    @NotNull(message = "TIMESLOT_DAY_MUST_NOT_BE_NULL")
    private Integer day;
    @Min(value = 0, message = "START_TIME_INVALID")
    @Max(value = Integer.MAX_VALUE, message = "START_TIME_INVALID")
    @NotNull(message = "START_TIME_MUST_NOT_BE_NULL")
    private Integer startTime;
    @Min(value = 0, message = "END_TIME_INVALID")
    @Max(value = Integer.MAX_VALUE, message = "END_TIME_INVALID")
    @NotNull(message = "END_TIME_MUST_NOT_BE_NULL")
    private Integer endTime;
    
    
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
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

}
