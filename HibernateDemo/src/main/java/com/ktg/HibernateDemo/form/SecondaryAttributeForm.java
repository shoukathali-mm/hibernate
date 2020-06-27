package com.ktg.HibernateDemo.form;

import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SecondaryAttributeForm {
	
	@Size(min = 1, max = 100, message = "PRIMARY_ATTRIBUTE_VALUE_INVALID_SIZE")
    @NotNull(message = "PRIMARY_ATTRIBUTE_VALUE_MUST_NOT_BE_NULL")
	private String primaryAttrValue;
	@Size(min = 1, max = 100, message = "SECONDARY_ATTRIBUTE_KEYS_INVALID_SIZE")
    @NotNull(message = "SECONDARY_ATTRIBUTE_KEYS_MUST_NOT_BE_NULL")
	private Set<String> secondaryAttrKeys;


	public String getPrimaryAttrValue() {
		return primaryAttrValue;
	}


	public void setPrimaryAttrValue(String primaryAttrValue) {
		this.primaryAttrValue = primaryAttrValue;
	}


	public Set<String> getSecondaryAttrKeys() {
		return secondaryAttrKeys;
	}


	public void setSecondaryAttrKeys(Set<String> secondaryAttrKeys) {
		this.secondaryAttrKeys = secondaryAttrKeys;
	}
	
	
	

}
