package com.shri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/hii")
	public String hii() {
	    return "secured API";
	}

	@GetMapping("/hello")
	public String hello() {
	    return "public API";
	}
	
	@GetMapping("/no")
	public String get()
	{
		return "no secure";
	}

}
