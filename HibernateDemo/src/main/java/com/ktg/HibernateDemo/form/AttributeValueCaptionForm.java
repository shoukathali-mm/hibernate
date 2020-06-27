package com.ktg.HibernateDemo.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AttributeValueCaptionForm {
	
	@Size(min = 1, max = 100, message = "ATTRIBUTE_VALUE_INVALID_SIZE")
    @NotNull(message = "ATTRIBUTE_VALUE_MUST_NOT_BE_NULL")
	private String value;
	
	@Size(min = 1, max = 100, message = "ATTRIBUTE_CAPTION_INVALID_SIZE")
    @NotNull(message = "ATTRIBUTE_CAPTION_MUST_NOT_BE_NULL")
	private String caption;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	

}
