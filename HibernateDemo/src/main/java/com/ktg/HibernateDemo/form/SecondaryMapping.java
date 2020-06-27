package com.ktg.HibernateDemo.form;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SecondaryMapping {
	
	@Size(min = 1, max = 100, message = "SECONDARY_ATTRIBUTES_INVALID_SIZE")
    @NotNull(message = "SECONDARY_ATTRIBUTES_MUST_NOT_BE_NULL")
    private List<@Valid SecondaryAttributeForm> secondaryAttributes;

	public List<SecondaryAttributeForm> getSecondaryAttributes() {
		return secondaryAttributes;
	}

	public void setSecondaryAttributes(List<SecondaryAttributeForm> secondaryAttributes) {
		this.secondaryAttributes = secondaryAttributes;
	}

}
