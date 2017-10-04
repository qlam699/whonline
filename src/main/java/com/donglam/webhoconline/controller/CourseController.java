package com.donglam.webhoconline.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	/*
	 * @GetMapping("/compkhoa") public String compkhoa(Model model) {
	 * //model.addAttribute("dskh", khs.getList()); return "comp/khoa"; }
	 */
	// create
	@GetMapping("/khoa/create")
	public String createkhoa(Model model) {
		model.addAttribute("khoa", new Khoa());
		return "comp/khoa";
	}

	// edit
	@GetMapping("/khoa/{id}/edit")
	public String editkhoa(@PathVariable String id, Model model) {
		model.addAttribute("khoa", ks.get(id));
		return "comp/khoa";
	}

	// message is delete
	@GetMapping("/isdelete")
	public String isdelete(Model model) {
		// model.addAttribute("id", id);
		return "comp/isdelete";
	}

	// delete
	@GetMapping("/khoa/{id}/delete")
	public String deletekhoa(@PathVariable String id, RedirectAttributes redirect) {
		Khoa k=ks.get(id);
		if( k ==null) {
			redirect.addFlashAttribute("success", "Delete Failed!");
			return "redirect:/adcourse";
		}
		ks.delete(k);
		redirect.addFlashAttribute("success", "Deleted successfully!");
		return "redirect:/adcourse";
	}

	// save
	@PostMapping("/khoa/save")
	public String saveKhoa(@Valid Khoa khoa, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "comp/khoa";
		}
		ks.saveOrUpdate(khoa);
		redirect.addFlashAttribute("success", "Saved successfully!");
		return "redirect:/adcourse";

	}

	// manager courses
	@GetMapping("/adcourse")
	public String adqlkhoahoc(Model model) {
		model.addAttribute("dskh", khs.getList());
		model.addAttribute("dskhoa", ks.getList());
		model.addAttribute("dsloaikh", lkhs.getList());

		return "adqlkhoahoc";
	}

}
