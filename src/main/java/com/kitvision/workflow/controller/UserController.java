package com.kitvision.workflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.kitvision.workflow.model.User;
/**
 * 
 * @author mohamed
 *
 * This is a controller class, that will handle all login password forget actions.
 */
@Controller
public class UserController {
	
	@RequestMapping(path = "/registration",method=RequestMethod.GET)
	public String showRegistration(Model model,WebRequest request) {
		User admin = new User();
		model.addAttribute("forAdminOnly",admin);
		return "registration";
	}
}
