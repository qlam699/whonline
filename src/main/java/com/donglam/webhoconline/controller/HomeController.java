package com.donglam.webhoconline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.donglam.webhoconline.model.LoaiKhoaHoc;
import com.donglam.webhoconline.service.LoaiKhoaHocService;

@Controller
public class HomeController {
	@Autowired(required = true)
    private LoaiKhoaHocService ad;
	
	@GetMapping("/")
	public String index(Model model) {
		//model.addAttribute("khoa", employeeService.findAll());
		/*List<LoaiKhoaHoc> x= ad.getList();
		for(LoaiKhoaHoc d: x) {
			System.out.print(d.getTenloaikh());
		}*/
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
	
	@GetMapping("/detailcourse")
	public String detailcourse(Model model) {
		return "detailcourse";
	}
	@GetMapping("/detailteacher")
	public String detailteacher(Model model) {
		return "detailteacher";
	}
}
