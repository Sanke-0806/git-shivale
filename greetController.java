package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feignClient.WelcomeApiClient;

@RestController
public class greetController {

	@Autowired
	WelcomeApiClient welcomeapiclient ;
	
	@GetMapping("/greet")
	public String GreetMsg() {
		return "Hey....."+ welcomeapiclient.invokeWelcomeApi() ;
	}
}
