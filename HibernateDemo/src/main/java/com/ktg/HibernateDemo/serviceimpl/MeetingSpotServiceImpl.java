package com.ktg.HibernateDemo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktg.HibernateDemo.enums.Status;
import com.ktg.HibernateDemo.exception.BadRequestException;
import com.ktg.HibernateDemo.exception.NotFoundException;
import com.ktg.HibernateDemo.form.MeetingSpotForm;
import com.ktg.HibernateDemo.model.MeetingSpot;
import com.ktg.HibernateDemo.repositories.SpotRepository;
import com.ktg.HibernateDemo.services.MeetingSpotService;
import com.ktg.HibernateDemo.view.MeetingSpotView;

@Service
public class MeetingSpotServiceImpl implements MeetingSpotService{

	@Autowired
	private SpotRepository spotRepository;
	
	@Override
	public MeetingSpotView createMeetingSpot(Integer eventId, MeetingSpotForm form) {
		// TODO Auto-generated method stub
		
		 if (form.getCapacity() != null && form.getCapacity() <= 0) {
	            throw new BadRequestException("SPOT_CAPACITY_SHOULD_BE_GREATER_THAN_ZERO");
	        }
		 
		 MeetingSpot meetingSpot=spotRepository.save(new MeetingSpot(eventId,form));
		return new MeetingSpotView(meetingSpot);
	}

	@Override
	public boolean deleteMeetingSpot(Integer eventId, Integer spotId) {
		// TODO Auto-generated method stub
		
		MeetingSpot spot = spotRepository.findBySpotIdAndEventIdAndStatusNot(spotId, eventId, Status.DELETE)
                .orElseThrow(() -> new NotFoundException("MEETING_SPOT_NOT_FOUND"));
		
		 spot.setStatus(Status.DELETE);
		 spotRepository.save(spot);
		return true;
	}

}
