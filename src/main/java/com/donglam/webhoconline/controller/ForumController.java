package com.donglam.webhoconline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.donglam.webhoconline.service.ThaoLuanService;

@Controller
public class ForumController {
	
	@Autowired
    private ThaoLuanService tls;
	
	@GetMapping("/forum")
	public String courses(Model model) {
		model.addAttribute("qtl", tls.getQuestion(1));
		model.addAttribute("rtl", tls.getReply(1));
		model.addAttribute("crtl", tls.getCountReply(1));
		
		return "forum";
	}
	
}