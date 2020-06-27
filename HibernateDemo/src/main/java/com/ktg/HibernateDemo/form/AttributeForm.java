package com.ktg.HibernateDemo.form;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AttributeForm {
	
	@Size(min = 1, max = 100, message = "ATTRIBUTE_KEY_INVALID_SIZE")
    @NotNull(message = "ATTRIBUTE_KEY_MUST_NOT_BE_NULL")
    private String attrKey;
    @NotNull(message = "ATTRIBUTE_OPTIONS_MUST_NOT_BE_NULL")
    private List<@Valid AttributeValueCaptionForm> options;
    @Size(min = 1, max = 100, message = "ATTRIBUTE_CAPTION_INVALID_SIZE")
    @NotNull(message = "ATTRIBUTE_CAPTION_MUST_NOT_BE_NULL")
    private String caption;
    
    
	public String getAttrKey() {
		return attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}
	public List<AttributeValueCaptionForm> getOptions() {
		return options;
	}
	public void setOptions(List<AttributeValueCaptionForm> options) {
		this.options = options;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}

}
