package com.donglam.webhoconline.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.donglam.webhoconline.model.Khoa;
import com.donglam.webhoconline.service.KhoaHocService;
import com.donglam.webhoconline.service.KhoaService;
import com.donglam.webhoconline.service.LoaiKhoaHocService;

@Controller
public class CourseController {
	
	@Autowired
    private KhoaHocService khs;
	@Autowired
    private KhoaService ks;
	@Autowired
	private LoaiKhoaHocService lkhs;
	
	@GetMapping("/courses")
	public String courses(Model model) {
		model.addAttribute("dskh", khs.getList());
		
		return "courses";
	}
	// manager courses
	@GetMapping("/adcourse")
	public String adqlkhoahoc(Model model) {
		model.addAttribute("dskh", khs.getList());
		model.addAttribute("dskhoa",ks.getList());
		model.addAttribute("dsloaikh",lkhs.getList());
		
		return "adqlkhoahoc";
	}
	
	@PostMapping("/khoahoc/save")
	public String saveKhoa(@Valid Khoa khoa, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "adcourse";
		}
		//System.out.println(khoa);
		/*ks.saveOrUpdate(khoa);
		redirect.addFlashAttribute("success", "Saved successfully!");*/
		return "redirect:/adcourse";
		
	}
	
}
