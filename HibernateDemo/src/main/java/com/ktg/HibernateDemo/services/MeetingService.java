package com.ktg.HibernateDemo.services;

import com.ktg.HibernateDemo.form.MeetingRequestForm;
import com.ktg.HibernateDemo.view.MeetingView;

public interface MeetingService {
	
	  public MeetingView createMeetingRequest(Integer eventId, Integer visitorId, MeetingRequestForm meetingForm);

}
