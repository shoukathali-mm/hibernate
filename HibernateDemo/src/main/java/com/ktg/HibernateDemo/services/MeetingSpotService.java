package com.ktg.HibernateDemo.services;

import com.ktg.HibernateDemo.form.MeetingSpotForm;
import com.ktg.HibernateDemo.view.MeetingSpotView;

public interface MeetingSpotService {
	
	
	MeetingSpotView createMeetingSpot(Integer eventId, MeetingSpotForm form);

	boolean deleteMeetingSpot(Integer eventId, Integer spotId);

}
