package com.pydog.springbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pydog.springbasic.response.HelloResponse;

@RestController
public class DemoRestController {

	@GetMapping("/hello")
	public HelloResponse hello() {
		HelloResponse response = new HelloResponse("Spring web basic REST demo", "Spring web basic REST demo", "Welcome!");	
		return response;
	}
}
