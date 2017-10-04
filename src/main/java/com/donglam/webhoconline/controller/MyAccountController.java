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
import com.donglam.webhoconline.service.NguoiDungService;

@Controller
public class MyAccountController {

	@Autowired
	private NguoiDungService nds;

	@GetMapping("/myaccount")
	public String courses(Model model) {
		model.addAttribute("nd", nds.get("ad_1"));

		return "myaccount";
	}

	@GetMapping("/myaccount/{id}/edit")
	public String edit(@PathVariable String id, Model model) {
		model.addAttribute("nd", nds.get(id));
		return "myaccount";
	}

	@PostMapping("/myaccount/save")
	public String edit(@Valid NguoiDung nd, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "myaccount";
		}
		nds.saveOrUpdate(nd);
		redirect.addFlashAttribute("success", "Saved nd successfully!");
		return "redirect:/myaccount";
	}
}
