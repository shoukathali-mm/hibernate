package com.ktg.HibernateDemo.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SettingsForm {
	
	
	    @Size(max = 100, message = "VISITOR_ATTR_INVALID_SIZE")
	    private String visitorAttr;
	    @Size(max = 100, message = "VISITOR_ATTR_VALUE_INVALID_SIZE")
	    private String visitorAttrValue;
	    @Size(max = 255, message = "VISITOR_LIST_API_INVALID_SIZE")
	    private String visitorListApi;
	    @Size(max = 255, message = "VISITOR_DETAILS_API_INVALID_SIZE")
	    private String visitorDetailsApi;
	    @NotNull(message = "EVENT_TIME_ZONE_CANNOT_BE_NULL")
	    @Size(max = 255, message = "EVENT_TIME_ZONE_INVALID_SIZE")
	    private String eventTimeZone;
	    
	    
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
		public String getEventTimeZone() {
			return eventTimeZone;
		}
		public void setEventTimeZone(String eventTimeZone) {
			this.eventTimeZone = eventTimeZone;
		}

}
