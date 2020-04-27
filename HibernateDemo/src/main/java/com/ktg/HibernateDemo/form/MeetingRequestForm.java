package com.ktg.HibernateDemo.form;

import java.util.Set;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MeetingRequestForm {
	
	@NotNull(message = "MEETING_DAY_MUST_NOT_BE_NULL")
    private Integer day;

    @Min(value = 1, message = "MEETING_VISITOR_ID_INVALID")
    @Max(value = Integer.MAX_VALUE, message = "MEETING_VISITOR_ID_INVALID")
    @NotNull(message = "MEETING_VISITOR_ID_MUST_NOT_BE_NULL")
    private Integer meetingVisitorId;

    @Size(max = 255, message = "MESSAGE_INVALID_SIZE")
    private String message;
    private Integer meetingPurposeId;

    private Set<Integer> requestedSlots;
    private Set<Integer> requestedSpots;
    
    
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getMeetingVisitorId() {
		return meetingVisitorId;
	}
	public void setMeetingVisitorId(Integer meetingVisitorId) {
		this.meetingVisitorId = meetingVisitorId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getMeetingPurposeId() {
		return meetingPurposeId;
	}
	public void setMeetingPurposeId(Integer meetingPurposeId) {
		this.meetingPurposeId = meetingPurposeId;
	}
	public Set<Integer> getRequestedSlots() {
		return requestedSlots;
	}
	public void setRequestedSlots(Set<Integer> requestedSlots) {
		this.requestedSlots = requestedSlots;
	}
	public Set<Integer> getRequestedSpots() {
		return requestedSpots;
	}
	public void setRequestedSpots(Set<Integer> requestedSpots) {
		this.requestedSpots = requestedSpots;
	}

}
