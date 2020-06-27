package com.ktg.HibernateDemo.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktg.HibernateDemo.exception.ConflictException;
import com.ktg.HibernateDemo.form.AttributeForm;
import com.ktg.HibernateDemo.form.AttributeMapping;
import com.ktg.HibernateDemo.form.PrimaryAttributeForm;
import com.ktg.HibernateDemo.form.SecondaryMapping;
import com.ktg.HibernateDemo.model.AttributeCaption;
import com.ktg.HibernateDemo.model.AttributeValue;
import com.ktg.HibernateDemo.model.PrimaryAttribute;
import com.ktg.HibernateDemo.model.SecondaryAttribute;
import com.ktg.HibernateDemo.repositories.PrimaryAttributeRepository;
import com.ktg.HibernateDemo.repositories.SecondaryAttributeRepository;
import com.ktg.HibernateDemo.services.AttributeService;
import com.ktg.HibernateDemo.view.BasicResponseView;
import com.ktg.HibernateDemo.view.PrimaryAttributeView;
import com.ktg.HibernateDemo.view.SecondaryAttributeView;


@Service
public class AttributeServiceImpl implements AttributeService{
	
	@Autowired
	private PrimaryAttributeRepository primaryAttributeRepository;
	
	 @Autowired
	 private SecondaryAttributeRepository secondaryAttributeRepository;

	@Override
	public PrimaryAttributeView updatePrimaryFilter(Integer eventId, PrimaryAttributeForm primaryAttributeForm) {
		// TODO Auto-generated method stub
		
		Optional<PrimaryAttribute> primaryAttrOptional=primaryAttributeRepository.findById(eventId);
		PrimaryAttribute primaryAttribute;
		
		 if (primaryAttrOptional.isPresent())
		 {
			 primaryAttribute=primaryAttrOptional.get();
			 
			 if (primaryAttribute.getAttrKey().equals(primaryAttributeForm.getPrimaryAttrValue())) {
			 
				 throw new ConflictException("PRIMARY_FILTER_ALREADY_SET");
			 }
			 
			 primaryAttribute.setAttrKey(primaryAttributeForm.getPrimaryAttrValue());
		 }
		 else
		 {
			 primaryAttribute=new PrimaryAttribute(eventId, primaryAttributeForm.getPrimaryAttrValue());
		 }
		
		 
		return new PrimaryAttributeView(primaryAttributeRepository.save(primaryAttribute));
	}

	@Override
	public List<SecondaryAttributeView> updateSecondaryFilter(Integer eventId, SecondaryMapping secondaryMapping) {
		// TODO Auto-generated method stub
		
		List<SecondaryAttribute> secondaryAttributes = new ArrayList<>();
		secondaryMapping.getSecondaryAttributes().stream().forEach(secondaryAttributeForm->
		 
				{
					secondaryAttributeForm.getSecondaryAttrKeys().stream().forEach(attrName->
					{
						SecondaryAttribute secondaryAttribute=new SecondaryAttribute(eventId, secondaryAttributeForm.getPrimaryAttrValue(), attrName);
						secondaryAttributes.add(secondaryAttribute);
					});
				});
		
		Iterable<SecondaryAttribute> saveAll=secondaryAttributeRepository.saveAll(secondaryAttributes);
		 Map<String,Set<String>> primaryAttrNameMap = StreamSupport.stream(saveAll.spliterator(), false)
	                .collect(Collectors.groupingBy(SecondaryAttribute::getPrimaryAttrValue,
	                        Collectors.mapping(SecondaryAttribute::getAttrKey, Collectors.toSet())));
		 List<SecondaryAttributeView> secondaryAttributeViews = primaryAttrNameMap
	                .entrySet()
	                .stream()
	                .map(entry -> new SecondaryAttributeView(eventId,
	                entry.getKey(), entry.getValue()))
	                .collect(Collectors.toList());
	        return secondaryAttributeViews;
	}

	@Override
	public BasicResponseView updateAttributeValues(Integer eventId, AttributeMapping attributeMapping) {
		// TODO Auto-generated method stub
		
		List<AttributeForm> attributeForms=attributeMapping.getAttributes();
		 List<AttributeValue> attributeValues = new ArrayList<>();
	        List<AttributeCaption> attributeCaptions = new ArrayList<>();
	        
	        attributeForms.stream().
	            forEach(attributeForm->
	            {
	            	updateAttrCaptions(eventId, attributeForm, attributeCaptions);
	            	updateAttrValues(eventId, attributeForm, attributeValues);
	            });
		
		return null;
	}

	private void updateAttrValues(Integer eventId, AttributeForm attributeForm, List<AttributeValue> attributeValues) {
		// TODO Auto-generated method stub
		
	}

	private void updateAttrCaptions(Integer eventId, AttributeForm attributeForm,
			List<AttributeCaption> attributeCaptions) {
		// TODO Auto-generated method stub
		
	}

}
