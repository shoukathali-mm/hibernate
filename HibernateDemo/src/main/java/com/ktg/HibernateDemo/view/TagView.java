package com.ktg.HibernateDemo.view;

import java.io.Serializable;

import com.ktg.HibernateDemo.model.Tag;

public class TagView implements Serializable {
	
	private Integer tagId;
    private String value;
    
    
	public TagView(Tag tag) {
		// TODO Auto-generated constructor stub
		this.value=tag.getValue();
		this.tagId=tag.getTagId();
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
