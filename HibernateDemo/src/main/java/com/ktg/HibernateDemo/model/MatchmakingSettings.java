package com.ktg.HibernateDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.ktg.HibernateDemo.form.SettingsForm;

@Entity
public class MatchmakingSettings {
	
	private Integer organizationId;
    @Id
    private Integer eventId;
    private String visitorAttr;
    private String visitorAttrValue;
    private String visitorListApi;
    private String visitorDetailsApi;
    private String eventTimezone;
    
    public MatchmakingSettings() {
    }

    public MatchmakingSettings(Integer organizationId, Integer eventId, SettingsForm settingsForm) {
        this.organizationId = organizationId;
        this.eventId = eventId;
        this.visitorAttr = settingsForm.getVisitorAttr();
        this.visitorAttrValue = settingsForm.getVisitorAttrValue();
        this.visitorListApi = settingsForm.getVisitorListApi();
        this.visitorDetailsApi = settingsForm.getVisitorDetailsApi();
        this.eventTimezone = settingsForm.getEventTimeZone();
    }
    
	public Integer getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
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
