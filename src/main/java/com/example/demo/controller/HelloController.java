package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		
		System.out.println("更新1");
		System.out.println("主干创建");
		return "Hello World!";
	}
	
}
