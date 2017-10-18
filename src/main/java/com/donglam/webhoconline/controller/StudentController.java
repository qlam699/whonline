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

import com.donglam.webhoconline.model.NguoiDung;
import com.donglam.webhoconline.model.NguoiDungDto;
import com.donglam.webhoconline.service.NguoiDungService;

@Controller
public class StudentController {

	@Autowired
	private NguoiDungService hvs;

	@GetMapping("/adstudents")
	public String adteachers(Model model) {
		model.addAttribute("dshv", hvs.getListStudent());
		return "adstudents";
	}
	
	// create
	@GetMapping("/hocvien/create")
	public String createtinnhan(Model model) {
		model.addAttribute("hocvien", new NguoiDung());
		return "comp/hocvien";
	}

	// edit
	@GetMapping("/hocvien/{id}/edit")
	public String edittinnhan(@PathVariable String id, Model model) {
		model.addAttribute("hocvien", hvs.get(id));
		return "comp/hocvien";
	}

	// delete
	@GetMapping("/hocvien/{id}/delete")
	public String deletekhoa(@PathVariable String id, RedirectAttributes redirect) {
		NguoiDung hv = hvs.get(id);
		if (hv == null) {
			redirect.addFlashAttribute("success", "Delete Failed!");
			return "redirect:/adstudents";
		}
		hvs.delete(hv);
		redirect.addFlashAttribute("success", "Deleted successfully!");
		return "redirect:/adstudents";
	}

	// save
	@PostMapping("/hocvien/save")
	public String savekhoa(@Valid NguoiDungDto nddto, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "comp/hocvien";
		}
		hvs.saveOrUpdate(new NguoiDung(nddto.getMand(), nddto.getHovatenlot(), nddto.getTen(), nddto.isPhai(),
				nddto.getNgaysinh(), nddto.getDiachi(), nddto.getCmnd(), nddto.getEmail(), nddto.getMatkhau(),
				nddto.getHinh(), nddto.getMota(), null));
		redirect.addFlashAttribute("success", "Saved successfully!");
		return "redirect:/adstudents";
	}
}
