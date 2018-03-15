package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController
{
	
	@RequestMapping("/hello")
	public String hello()
	{
		System.out.println("hie");
		return "success";
		
	}
	
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		System.out.println("hie1");
		return "welcome";
		
	}
	
	
	
	
	

}
