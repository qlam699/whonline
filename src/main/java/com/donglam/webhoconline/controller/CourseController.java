package com.donglam.webhoconline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.donglam.webhoconline.service.KhoaHocService;

@Controller
public class CourseController {
	
	@Autowired
    private KhoaHocService khs;
	
	@GetMapping("/courses")
	public String courses(Model model) {
		model.addAttribute("dskh", khs.getList());
		
		return "courses";
	}
	
}
