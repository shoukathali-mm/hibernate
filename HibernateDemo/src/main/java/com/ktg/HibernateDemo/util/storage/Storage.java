package com.ktg.HibernateDemo.util.storage;

import org.springframework.web.multipart.MultipartFile;

public interface Storage {

	
	public boolean isValidImage(MultipartFile file);
}
