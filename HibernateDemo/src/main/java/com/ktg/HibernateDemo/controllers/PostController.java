package com.ktg.HibernateDemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ktg.HibernateDemo.model.Post;
import com.ktg.HibernateDemo.services.PostService;

@RestController
public class PostController {

	
	@Autowired
	private PostService postService;

	@GetMapping("/posts")
	public List<Post> getAllPosts() {
	    return postService.findAll();
	}

	@GetMapping("/posts/{id}")
	public Optional<Post> getPostById(@PathVariable Integer id) {
	    return postService.findById(id);
	}
}
