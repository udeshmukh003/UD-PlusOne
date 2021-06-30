package com.uvd.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uvd.service.ServiceApp;

@RestController
public class WelcomeController {
	
	@Autowired
	private ServiceApp service;
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		return welcomeMessage;
	}

}
