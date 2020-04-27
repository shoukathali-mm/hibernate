package com.ktg.HibernateDemo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktg.HibernateDemo.exception.ConflictException;
import com.ktg.HibernateDemo.form.SettingsForm;
import com.ktg.HibernateDemo.model.MatchmakingSettings;
import com.ktg.HibernateDemo.repositories.SettingsRepository;
import com.ktg.HibernateDemo.services.SettingsService;
import com.ktg.HibernateDemo.view.SettingsView;

@Service
public class SettingsServiceImpl implements SettingsService{
	
	@Autowired
	SettingsRepository settingsRepository;

	@Override
	public SettingsView createSettings(SettingsForm settingsForm, int organizationId, int eventId) {
		// TODO Auto-generated method stub
		
		MatchmakingSettings settings = null;
		
		
		try
		{
		settings=getSettingsOrThrow(eventId);
		settings.setEventTimezone(settingsForm.getEventTimeZone());
		settings.setVisitorAttr(settingsForm.getVisitorAttr());
		settings.setVisitorAttrValue(settingsForm.getVisitorAttrValue());
		settings.setVisitorListApi(settingsForm.getVisitorListApi());
		settings.setVisitorDetailsApi(settingsForm.getVisitorDetailsApi());
		}catch (ConflictException ex) {
			// TODO: handle exception
			settings=new MatchmakingSettings(organizationId,eventId,settingsForm);
		}
		
		settingsRepository.save(settings);
		
		
		return new SettingsView(settings);
	}

	@Override
	public MatchmakingSettings getSettingsOrThrow(int eventId) {
		// TODO Auto-generated method stub
		 return settingsRepository.findByEventId(eventId)
	                .orElseThrow(() -> new ConflictException("MATCHMAKING_NOT_CONFIGURED"));
	}

	@Override
	public SettingsView getMatchmakingSettings(int eventId) {
		// TODO Auto-generated method stub
		MatchmakingSettings matchmakingSettings=getSettingsOrThrow(eventId);
		return new SettingsView(matchmakingSettings);
	}

}
