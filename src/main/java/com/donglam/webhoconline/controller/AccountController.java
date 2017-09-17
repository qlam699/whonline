package com.donglam.webhoconline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
	
	@GetMapping("/account")
	public String taikhoan(Model model) {
		
		return "adqltaikhoan";
	}
}
