package com.devopsbuddy.web.controllers;

import org.springframework.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
