package com.ktg.HibernateDemo.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktg.HibernateDemo.enums.Status;
import com.ktg.HibernateDemo.exception.BadRequestException;
import com.ktg.HibernateDemo.form.SlotForm;
import com.ktg.HibernateDemo.model.MatchmakingSlot;
import com.ktg.HibernateDemo.repositories.MatchmakingSlotRepository;
import com.ktg.HibernateDemo.services.MatchmakingSlotService;


@Service
public class MatchmakingSlotServiceImpl implements MatchmakingSlotService {
	
	
	 @Autowired
	    private MatchmakingSlotRepository slotRepository;

	@Override
	public Integer createSlot(int eventId, SlotForm form) {
		// TODO Auto-generated method stub
		
		
		if (form.getEndTime() <= form.getStartTime()) {
            throw new BadRequestException("INVALID_START_END_COMBINATION");
        }
		
		
		    Integer slotDay = form.getDay();
	        Integer startTime = form.getStartTime();
	        Integer endTime = form.getEndTime();
	        
	        
	        Optional<MatchmakingSlot> duplOptional = slotRepository.findByEventIdAndSlotDayAndStatusAndStartTimeAndEndTime(eventId, slotDay, Status.ACTIVE, startTime, endTime);
	       
	        System.out.println(duplOptional);
	        duplOptional.ifPresent(consumer -> {
	           // LOG.debug("DUPLICATE_TIME_SLOT EVENT_ID {}", eventId);
	            throw new BadRequestException("DUPLICATE_TIME_SLOT");
	        });
	        
	        MatchmakingSlot slot = new MatchmakingSlot(eventId, startTime, endTime, form.getDay());
	        slotRepository.save(slot);
	        return slot.getSlotId();
	
	}

}
