package com.employer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView LandingPage() {
		System.out.println("In Home page");
	
		return new ModelAndView("index");

	}
	
}
