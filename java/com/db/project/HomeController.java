package com.db.project;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import data.DTO.DB_DTO;
import data.SERVICE.DB_SERVICE_INTERFACE;


@Controller
public class HomeController {
	
	
	@Autowired
	private DB_SERVICE_INTERFACE service;
	
	
	@GetMapping("/")
	public String home() {
		
		return "root";
	}
	
	
	
	@PostMapping("getUserName")
	public @ResponseBody String getUserName(@RequestParam("name")String name) {
		
		String resultValue = service.getUserName(name);
		
		System.out.println(name);
		
		System.out.println("DB에서 가져온 결과값");
		System.out.println(resultValue);
		
		return resultValue;
	}
	
	@PostMapping("getUserAge")
	public @ResponseBody int getUserAge(@RequestParam("age")String age) {
		
		int resultValue = service.getUserAge(age);
		
		
		System.out.println("DB에서 가져온 결과값");
		System.out.println(resultValue);
		
		return resultValue;
	}
	
	@PostMapping("getUserGender")
	public @ResponseBody String getUserGender(@RequestParam("gender")String gender) {
		
		String resultValue = service.getUserGender(gender);
		
		
		System.out.println("DB에서 가져온 결과값");
		System.out.println(resultValue);
		
		return resultValue;
	}
	
	@GetMapping("getUserAll")
	public @ResponseBody HashMap<String, Object> getUserAll(@RequestParam("all")String all) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		DB_DTO dto = service.getUserAll(all);
		
		map.put("result", dto);
		
		System.out.println("DB에서 가져온 결과값");
		System.out.println(dto);
		
		return map;
	}
}
