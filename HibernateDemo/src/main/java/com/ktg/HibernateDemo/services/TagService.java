package com.ktg.HibernateDemo.services;

import java.util.List;

import com.ktg.HibernateDemo.form.TagForm;
import com.ktg.HibernateDemo.view.TagView;

public interface TagService {
	
	
	public TagView createTag(TagForm tagForm);

	public List<TagView> searchAllTags(String searchTerm, Integer page, Integer limit);

}
