package com.ktg.HibernateDemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktg.HibernateDemo.model.User;
import com.ktg.HibernateDemo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers()
	{
		return (List<User>) userRepository.findAll();
	}
	
	
	public Optional<User> getUserById(Integer id)
	{
		return userRepository.findById(id);
	}
	
	public void addUser(User user)
	{
		userRepository.save(user);
	}

}
