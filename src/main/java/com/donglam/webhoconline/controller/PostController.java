package com.donglam.webhoconline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
	
	@GetMapping("/post")
	public String post(Model model) {
		
		return "adpost";
	}
}
