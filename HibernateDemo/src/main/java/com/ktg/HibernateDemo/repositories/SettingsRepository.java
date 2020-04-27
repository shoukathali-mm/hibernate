package com.ktg.HibernateDemo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ktg.HibernateDemo.model.MatchmakingSettings;

public interface SettingsRepository extends CrudRepository<MatchmakingSettings, Integer> {

	Optional<MatchmakingSettings> findByEventId(int eventId);

}
