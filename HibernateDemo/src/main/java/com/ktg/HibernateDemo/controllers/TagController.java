package com.ktg.HibernateDemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ktg.HibernateDemo.form.TagForm;
import com.ktg.HibernateDemo.services.TagService;
import com.ktg.HibernateDemo.view.TagView;

@RestController
@RequestMapping("tags")
public class TagController {

	@Autowired
	TagService tagService;

	@PostMapping("tag")
	public TagView createTag(@RequestBody @Valid TagForm tagForm) {

		return tagService.createTag(tagForm);

	}

	@GetMapping("find-tags")
	public List<TagView> searchAllTags(@RequestParam String searchTerm,
			@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "limit", required = false, defaultValue = "1") Integer limit) {
		
		
		return tagService.searchAllTags(searchTerm,page,limit);

	}
	
	

}
