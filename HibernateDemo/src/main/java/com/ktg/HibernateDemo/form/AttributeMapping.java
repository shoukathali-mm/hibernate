package com.ktg.HibernateDemo.form;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AttributeMapping {
	
	  @Size(min = 1, max = 100, message = "ATTRIBUTES_INVALID_SIZE")
      @NotNull(message = "ATTRIBUTES_MUST_NOT_BE_NULL")
	   private List<@Valid AttributeForm> attributes;
	  
	  
	  public List<AttributeForm> getAttributes() {
	        return attributes;
	    }

	    public void setAttributes(List<AttributeForm> attributes) {
	        this.attributes = attributes;
	    }

}
