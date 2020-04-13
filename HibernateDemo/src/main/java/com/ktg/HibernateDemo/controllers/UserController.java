package com.ktg.HibernateDemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ktg.HibernateDemo.model.User;
import com.ktg.HibernateDemo.services.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable Integer id)
	{
		return userService.getUserById(id);
	}
	
	@PostMapping("/user/addNew")
	public void addUser(@RequestBody User user)
	{
		userService.addUser(user);
	}

}
