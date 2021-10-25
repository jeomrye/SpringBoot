package com.example.myspring.controller;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@RestController
public class HomeController {
	@GetMapping("/home")
	public String Hello() {
		return "Hello World!";
	}
}
