package com.ktg.HibernateDemo.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ktg.HibernateDemo.exception.BadRequestException;
import com.ktg.HibernateDemo.exception.ConflictException;
import com.ktg.HibernateDemo.form.TagForm;
import com.ktg.HibernateDemo.model.Tag;
import com.ktg.HibernateDemo.repositories.TagRepository;
import com.ktg.HibernateDemo.services.TagService;
import com.ktg.HibernateDemo.util.Objects;
import com.ktg.HibernateDemo.view.TagView;

@Service
public class TagServiceImpl implements TagService{
	
	@Autowired
	TagRepository tagRepository;
	

	@Override
	public TagView createTag(TagForm tagForm) {
		// TODO Auto-generated method stub
		
		List<Tag> tags=tagRepository.findByValue(tagForm.getTagValue());
		
		if(!Objects.isEmpty(tags))
		{
			throw new ConflictException("TAG_ALREADY_EXIST");
		}
		Tag tag=new Tag(tagForm);
		tagRepository.save(tag);
		return new TagView(tag);
	}


	@Override
	public List<TagView> searchAllTags(String searchTerm, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		if(Objects.size(searchTerm.trim()) > 1)
		{
			Pageable pageable=PageRequest.of(page, limit);
			
			List<Tag> tags=tagRepository.findByValueContaining(searchTerm.trim(),pageable);
			
			List<TagView> tagViews=tags.stream().map(TagView::new)
			.collect(Collectors.toList());
			
			return tagViews;
		} else
		{
			throw new BadRequestException("SERACH_TERM_CONTAIN_MINIMUM_2_CHARACTER");
		}
		
	}

}
