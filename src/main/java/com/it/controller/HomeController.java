package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomeController {
	@RequestMapping(value = "/") // value={"/","/home"}
	public String showHomePage() {
		return "/home/welcome";
	}

	@RequestMapping(value = "/home")
	public String showHome() {
		return "/home/home";
	}
}
