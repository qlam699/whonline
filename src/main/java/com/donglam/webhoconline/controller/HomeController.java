package com.donglam.webhoconline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model) {
		//model.addAttribute("khoa", employeeService.findAll());
		
		return "index";
	}
	//modal login
	@GetMapping("/loginregister")
	public String login(Model model) {
		return "loginregister";
	}
	//modal post
		@GetMapping("/detailpost")
		public String detailpost(Model model) {
			return "detailpost";
		}
	// some other pages
	@GetMapping("/contact")
	public String contact(Model model) {
		return "contact";
	}
	@GetMapping("/courses")
	public String courses(Model model) {
		return "courses";
	}
	@GetMapping("/teachers")
	public String teachers(Model model) {
		return "teachers";
	}
	@GetMapping("/myaccount")
	public String myaccount(Model model) {
		return "myaccount";
	}
	@GetMapping("/detailcourse")
	public String detailcourse(Model model) {
		return "detailcourse";
	}
	@GetMapping("/detailteacher")
	public String detailteacher(Model model) {
		return "detailteacher";
	}
	@GetMapping("/forum")
	public String forum(Model model) {
		return "forum";
	}
}
