package com.donglam.webhoconline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MessageController {
	@GetMapping("/message")
	public String courses(Model model) {
		//model.addAttribute("dskh", khs.getList());
			
		return "admessage";
	}
}
