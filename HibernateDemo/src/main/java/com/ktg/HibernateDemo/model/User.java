package com.ktg.HibernateDemo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	private Integer id;
	private String firstname;
	private String lastname;
	
	@ManyToOne
	@JoinColumn(name="locationid",insertable=false,updatable=false)
	private Location location;
	
	private Integer locationid;
	

	private String email;
	
	@OneToMany(mappedBy="user")
	private List<Post> posts;
	
	public Integer getLocationid() {
		return locationid;
	}
	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}
	
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String firstname, String lastname, Location location, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
