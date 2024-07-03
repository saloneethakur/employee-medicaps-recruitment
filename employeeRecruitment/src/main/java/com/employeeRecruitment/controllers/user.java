package com.employeeRecruitment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class user {
	@RequestMapping(value ="/user_panel")
	public String registerPage()
	{
		return "user_panel";
		
	}
	

}
