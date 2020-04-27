package com.ktg.HibernateDemo.services;

import com.ktg.HibernateDemo.form.SlotForm;

public interface MatchmakingSlotService {
	
	public Integer createSlot(int eventId, SlotForm form);

}
