package com.practice1.webApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/hello")
	String sayHello() {
		return "Hello World";
	}
	
}
