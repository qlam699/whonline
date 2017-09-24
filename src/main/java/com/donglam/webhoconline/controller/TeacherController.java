package com.donglam.webhoconline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.donglam.webhoconline.service.KhoaHocService;
import com.donglam.webhoconline.service.NguoiDungService;

@Controller
public class TeacherController {
	
//	@Autowired
//    private NguoiDungService gvs;
	
	@GetMapping("/teachers")
	public String teachers(Model model) {
		// model.addAttribute("dsgv", gvs.getList());
		
		return "teachers";
	}
	
}
