package com.ktg.HibernateDemo.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PrimaryAttributeForm {
	
	
	@Size(min = 1, max = 100, message = "PRIMARY_ATTRIBUTE_VALUE_INVALID_SIZE")
    @NotNull(message = "PRIMARY_ATTRIBUTE_VALUE_MUST_NOT_BE_NULL")
	private String primaryAttrValue;

	public String getPrimaryAttrValue() {
		return primaryAttrValue;
	}

	public void setPrimaryAttrValue(String primaryAttrValue) {
		this.primaryAttrValue = primaryAttrValue;
	}
	
	

}
