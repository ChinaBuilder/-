package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@RequestMapping()
	public String showLogin() {
		return "/login/login";
	}
	
	@RequestMapping(value="/check")
	public String showHome() {
		System.out.println("开始验证");
		return "/home/home";
	}
}
