package com.ktg.HibernateDemo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ktg.HibernateDemo.enums.Status;
import com.ktg.HibernateDemo.model.MatchmakingSlot;


@Repository
public interface MatchmakingSlotRepository extends CrudRepository<MatchmakingSlot, Integer>{

	Optional<MatchmakingSlot> findByEventIdAndSlotDayAndStatusAndStartTimeAndEndTime(int eventId, Integer slotDay,
			Status active, Integer startTime, Integer endTime);

}
