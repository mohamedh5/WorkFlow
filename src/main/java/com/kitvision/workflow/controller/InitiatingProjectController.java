package com.kitvision.workflow.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/initiating")
@PreAuthorize(value="hasAuthority('')")
public class InitiatingProjectController {

	@GetMapping
	public String toInitiatingPage() {
		return "initiating";
	}
	
	
}
