package com.ktg.HibernateDemo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ktg.HibernateDemo.form.DocumentForm;
import com.ktg.HibernateDemo.services.DocumentService;
import com.ktg.HibernateDemo.util.storage.Storage;
import com.ktg.HibernateDemo.view.DocumentView;


public class DocumentServiceImpl implements DocumentService{
	
	
	 @Autowired
	    private Storage storage;

	@Override
	public DocumentView addImage(DocumentForm form) {
		// TODO Auto-generated method stub
		return null;
		
		
	}

}
