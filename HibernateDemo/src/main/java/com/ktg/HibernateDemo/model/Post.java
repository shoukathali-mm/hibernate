package com.ktg.HibernateDemo.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	
	@Id
	private Integer id;
	private LocalDateTime postDate;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	private String details;
	
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Post(Integer id, LocalDateTime postDate, User user, String details) {
		super();
		this.id = id;
		this.postDate = postDate;
		this.user = user;
		this.details = details;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public LocalDateTime getPostDate() {
		return postDate;
	}


	public void setPostDate(LocalDateTime postDate) {
		this.postDate = postDate;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}
	

}
