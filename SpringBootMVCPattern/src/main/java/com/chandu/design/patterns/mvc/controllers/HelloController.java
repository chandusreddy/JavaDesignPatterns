package com.chandu.design.patterns.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String Hello(ModelMap modelMap) {
		// Using the model class via ModelMap from Spring framework
		modelMap.addAttribute("msg", "Design Pattern");
		return "helloMvc";

	}

}
