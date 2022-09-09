package com.dandigam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping
	public String welcomeMsg() {
		
		return "Welcome Docker setup";
	}

}
