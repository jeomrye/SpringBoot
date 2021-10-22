package com.example.myspring.controller;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootConfiguration
@RestController
public class IndexController {

	@RequestMapping("/")
	public ModelAndView Index(ModelAndView mav) {
		
		mav.setViewName("index");
		return mav;
	}
}
