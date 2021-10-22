package com.example.myspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myspring.dao.TestDAO;
import com.example.myspring.dto.TestDTO;

@RestController
@RequestMapping
public class DBConnectTestCtrl {

	@Autowired
	private TestDAO testDAO;
	
	@GetMapping("/hello")
	public List<TestDTO> HelloWorld(){
		return testDAO.getTestData();
	}
	
}
