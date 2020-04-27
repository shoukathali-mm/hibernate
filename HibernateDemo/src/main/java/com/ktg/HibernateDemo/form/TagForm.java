package com.ktg.HibernateDemo.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TagForm {
	
	 @Size(min = 1, max = 100, message = "TAG_VALUE_INVALID_SIZE")
	    @NotNull(message = "TAG_VALUE_MUST_NOT_BE_NULL")
	    private String tagValue;

	public String getTagValue() {
		return tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
