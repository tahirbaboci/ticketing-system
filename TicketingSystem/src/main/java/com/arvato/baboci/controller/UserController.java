package com.arvato.baboci.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	
	@RequestMapping(value="/user/register", method=RequestMethod.GET)
	public String register(Map<String,Object> map){
		return "user/register";
	}
	
	
	
	@RequestMapping(value="/user/details", method=RequestMethod.POST)
	public String details(  @RequestParam("fname")  String fname,
							@RequestParam("lname")  String lname,
							@RequestParam("email")  String email,
							@RequestParam("mobile") String mobile,		
							Map<String,Object> map){
		
		map.put("fname", fname);
		map.put("lname", lname);
		map.put("email", email);
		map.put("mobile", mobile);
		
		return "user/details";
		
	}
}
