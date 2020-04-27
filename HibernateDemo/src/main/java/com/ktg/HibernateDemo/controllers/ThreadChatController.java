package com.ktg.HibernateDemo.controllers;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("events/{eventId}/visitors/{visitorId}/threads")
public class ThreadChatController {
	
	 @NotNull(message = "RECIPIENT_IDS_MUST_NOT_BE_NULL")
	    @Size(min = 1, message = "RECIPIENT_IDS_MUST_NOT_NE_EMPTY")
	    private List<Integer> visitorIds;

}
