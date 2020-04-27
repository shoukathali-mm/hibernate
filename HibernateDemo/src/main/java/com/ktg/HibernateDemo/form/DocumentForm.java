package com.ktg.HibernateDemo.form;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

public class DocumentForm {
	
	
	 @NotNull(message = "{com.pinmicro.eventplus.matchmaking.form.DocumentForm.file.NotNull}")
	  private MultipartFile attachment;

	  private String name;
	  
	  public DocumentForm(MultipartFile attachment, String name) {
		    this.attachment = attachment;
		    this.name = name;
		  }

		  public MultipartFile getAttachment() {
		    return attachment;
		  }

		  public void setAttachment(MultipartFile attachment) {
		    this.attachment = attachment;
		  }

		  public String getName() {
		    return name;
		  }

		  public void setName(String name) {
		    this.name = name;
		  }


}
