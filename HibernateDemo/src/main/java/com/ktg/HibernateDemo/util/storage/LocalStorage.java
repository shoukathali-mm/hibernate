package com.ktg.HibernateDemo.util.storage;

import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.tika.Tika;
import org.springframework.web.multipart.MultipartFile;

import com.ktg.HibernateDemo.exception.NotFoundException;

public class LocalStorage implements Storage{

	@Override
	public boolean isValidImage(MultipartFile file) {
		// TODO Auto-generated method stub
		
		 try {
	            ImageIO.read(file.getInputStream());
	        } catch (IOException ex) {
	            return false;
	        }
		 
		 Tika tika = new Tika();
	        String detectedType;
	        try {
	            detectedType = tika.detect(file.getBytes());
	        } catch (IOException ex) {
	            throw new NotFoundException("IMAGE_UPLOAD_FAILED");
	        }
	        String[] type = detectedType.split("/");
	        if (detectedType.equals(file.getContentType())) {
	            if (type[0].equals("image")) {
	                if (type[1].equals("jpeg") || type[1].equals("png") || type[1].equals("gif")) {
	                    return true;
	                }
	            }
	        }
		return false;
	}

}
