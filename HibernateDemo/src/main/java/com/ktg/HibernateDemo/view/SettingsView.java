package com.ktg.HibernateDemo.view;

import com.ktg.HibernateDemo.model.MatchmakingSettings;

public class SettingsView {

	private Integer eventId;
	private String visitorAttr;
	private String visitorAttrValue;
	private String visitorListApi;
	private String visitorDetailsApi;
	private String eventTimezone;
	
	
	
	
	public SettingsView() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SettingsView(MatchmakingSettings settings) {
		// TODO Auto-generated constructor stub
		this.eventId=settings.getEventId();
		this.visitorAttr = settings.getVisitorAttr();
		this.visitorAttrValue = settings.getVisitorAttrValue();
		this.visitorListApi = settings.getVisitorListApi();
		this.visitorDetailsApi = settings.getVisitorDetailsApi();
		this.eventTimezone = settings.getEventTimezone();
		
	}
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public String getVisitorAttr() {
		return visitorAttr;
	}
	public void setVisitorAttr(String visitorAttr) {
		this.visitorAttr = visitorAttr;
	}
	public String getVisitorAttrValue() {
		return visitorAttrValue;
	}
	public void setVisitorAttrValue(String visitorAttrValue) {
		this.visitorAttrValue = visitorAttrValue;
	}
	public String getVisitorListApi() {
		return visitorListApi;
	}
	public void setVisitorListApi(String visitorListApi) {
		this.visitorListApi = visitorListApi;
	}
	public String getVisitorDetailsApi() {
		return visitorDetailsApi;
	}
	public void setVisitorDetailsApi(String visitorDetailsApi) {
		this.visitorDetailsApi = visitorDetailsApi;
	}
	public String getEventTimezone() {
		return eventTimezone;
	}
	public void setEventTimezone(String eventTimezone) {
		this.eventTimezone = eventTimezone;
	}
	
	

}
