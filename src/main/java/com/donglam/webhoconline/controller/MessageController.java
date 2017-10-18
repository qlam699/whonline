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

import com.donglam.webhoconline.model.TinNhan;
import com.donglam.webhoconline.model.TinNhanDto;
import com.donglam.webhoconline.service.TinNhanService;

@Controller
public class MessageController {

	@Autowired
	private TinNhanService tns;

	@GetMapping("/message")
	public String message(Model model) {
		model.addAttribute("dstn", tns.getList());

		return "admessage";
	}

	// create
	@GetMapping("/tinnhan/create")
	public String createtinnhan(Model model) {
		model.addAttribute("tinnhan", new TinNhan());
		return "comp/tinnhan";
	}

	// edit
	@GetMapping("/tinnhan/{id}/edit")
	public String edittinnhan(@PathVariable Integer id, Model model) {
		model.addAttribute("tinnhan", tns.get(id));
		return "comp/tinnhan";
	}

	// delete
	@GetMapping("/tinnhan/{id}/delete")
	public String deletekhoa(@PathVariable Integer id, RedirectAttributes redirect) {
		TinNhan tn = tns.get(id);
		if (tn == null) {
			redirect.addFlashAttribute("success", "Delete Failed!");
			return "redirect:/admessage";
		}
		tns.delete(tn);
		redirect.addFlashAttribute("success", "Deleted successfully!");
		return "redirect:/admessage";
	}

	// save
	@PostMapping("/tinnhan/save")
	public String savekhoa(@Valid TinNhanDto tndto, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "comp/tinnhan";
		}
		TinNhan tn = new TinNhan(tndto.getMatn(), tndto.getTieude(), tndto.getTggui(), tndto.getNoidung());
		tns.saveOrUpdate(tn);
		redirect.addFlashAttribute("success", "Saved successfully!");
		return "redirect:/admessage";
	}

}
