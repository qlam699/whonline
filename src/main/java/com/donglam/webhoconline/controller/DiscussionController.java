package com.donglam.webhoconline.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.donglam.webhoconline.model.ThaoLuan;
import com.donglam.webhoconline.model.ThaoLuanDto;
import com.donglam.webhoconline.model.ThaoLuanId;
import com.donglam.webhoconline.service.KhoaHocService;
import com.donglam.webhoconline.service.NguoiDungService;
import com.donglam.webhoconline.service.ThaoLuanService;

@Controller
public class DiscussionController {

	@Autowired
	private ThaoLuanService tls;
	@Autowired
	private KhoaHocService khs;
	@Autowired
	private NguoiDungService nds;

	@GetMapping("/discussion")
	public String discussion(Model model) {
		model.addAttribute("dstl", tls.getList());
		return "addiscussion";
	}

	// create
	@GetMapping("/thaoluan/create")
	public String createthaoluan(Model model) {
		model.addAttribute("thaoluan", new ThaoLuan());
		model.addAttribute("listnd", nds.getListTeaStu());
		model.addAttribute("listkh", khs.getList());
		return "comp/thaoluan";
	}

	// edit
	@GetMapping("/thaoluan/{id}/edit")
	public String editthaoluan(@PathVariable String id, Model model) throws ParseException {
		String[] tam = id.split("z");
		String dt = tam[1] + " " + tam[2];
		/*
		 * System.out.println(dt); String x=UtilDate.changeDateTime(dt, false) ;
		 * System.out.println(x);
		 */
		model.addAttribute("thaoluan", tls.get(new ThaoLuanId(tam[0], dt)));
		model.addAttribute("listnd", nds.getListTeaStu());
		model.addAttribute("listkh", khs.getList());
		return "comp/thaoluan";
	}

	// delete
	@GetMapping("/thaoluan/{id}/delete")
	public String deletekhoa(@PathVariable String id, RedirectAttributes redirect) {
		String[] tam = id.split("z");
		String dt = tam[1] + " " + tam[2];
		ThaoLuan tl = tls.get(new ThaoLuanId(tam[0], dt));
		if (tl == null) {
			redirect.addFlashAttribute("success", "Delete Failed!");
			return "redirect:/discussion";
		}
		tls.delete(tl);
		redirect.addFlashAttribute("success", "Deleted successfully!");
		return "redirect:/discussion";
	}

	// save
	@PostMapping("/thaoluan/save")
	public String savekhoa(@Valid ThaoLuanDto tldto, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "comp/thaoluan";
		}
		tls.saveOrUpdate(new ThaoLuan(tldto.getKhoahoc(), tldto.getThaoluanid(), tldto.getNoidung(), tldto.getMatl()));
		redirect.addFlashAttribute("success", "Saved successfully!");
		return "redirect:/discussion";
	}
}
