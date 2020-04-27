package com.ktg.HibernateDemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ktg.HibernateDemo.form.TagForm;


@Entity
public class Tag {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tagId;
	
    private String value;
    
    

	public Tag() {
		super();
	}
	
	public Tag(TagForm tagForm)
	{
		this.value=tagForm.getTagValue();
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
