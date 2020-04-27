package com.ktg.HibernateDemo.services;

import com.ktg.HibernateDemo.form.SettingsForm;
import com.ktg.HibernateDemo.model.MatchmakingSettings;
import com.ktg.HibernateDemo.view.SettingsView;

public interface SettingsService {
	
	public SettingsView createSettings(SettingsForm settingsForm,int organizationId,int eventId);
	
	public MatchmakingSettings getSettingsOrThrow(int eventId);
	
	public SettingsView getMatchmakingSettings(int eventId);

}
