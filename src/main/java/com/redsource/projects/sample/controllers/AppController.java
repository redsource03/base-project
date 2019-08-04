package com.redsource.projects.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping
	public String sampleGet() {
		return "Hello World";
	}

}
