package com.db.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import data.SERVICE.DB_SERVICE_INTERFACE;


@Controller
public class HomeController {
	
	
	@Autowired
	private DB_SERVICE_INTERFACE service;
	
	
	@GetMapping("/")
	public String home() {
		
		return "root";
	}
	
	
	
	@GetMapping("getUserName")
	public @ResponseBody String getUserName() {
		String resultValue = service.getUserName();
		
		System.out.println("DB에서 가져온 결과값");
		System.out.println(resultValue);
		
		return resultValue;
	}
}
