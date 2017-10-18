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

import com.donglam.webhoconline.model.DanhGia;
import com.donglam.webhoconline.model.DanhGiaDto;
import com.donglam.webhoconline.model.DanhGiaId;
import com.donglam.webhoconline.service.DanhGiaService;
import com.donglam.webhoconline.service.KhoaHocService;
import com.donglam.webhoconline.service.NguoiDungService;

@Controller
public class EvaluationController {

	@Autowired
	private DanhGiaService dgs;
	@Autowired
	private NguoiDungService nds;
	@Autowired
	private KhoaHocService khs;

	@GetMapping("/evaluation")
	public String discussion(Model model) {
		model.addAttribute("dsdg", dgs.getList());

		return "adevaluation";
	}

	// create
	@GetMapping("/danhgia/create")
	public String createtinnhan(Model model) {
		model.addAttribute("danhgia", new DanhGia());
		model.addAttribute("listhv", nds.getListStudent());
		model.addAttribute("listgv", nds.getListTeacher());
		model.addAttribute("listkh", khs.getList());
		return "comp/danhgia";
	}

	// edit
	@GetMapping("/danhgia/{id}/edit")
	public String edittinnhan(@PathVariable String id, Model model) {
		String[] tam = id.split("z");
		model.addAttribute("danhgia", dgs.get(new DanhGiaId(tam[0], tam[1], tam[2])));
		model.addAttribute("listhv", nds.getListStudent());
		model.addAttribute("listgv", nds.getListTeacher());
		model.addAttribute("listkh", khs.getList());
		return "comp/danhgia";
	}

	// delete
	@GetMapping("/danhgia/{id}/delete")
	public String deletekhoa(@PathVariable String id, RedirectAttributes redirect) {
		String[] tam = id.split("z");
		DanhGia dg = dgs.get(new DanhGiaId(tam[0], tam[1], tam[2]));
		if (dg == null) {
			redirect.addFlashAttribute("success", "Delete Failed!");
			return "redirect:/evaluation";
		}
		dgs.delete(dg);
		redirect.addFlashAttribute("success", "Deleted successfully!");
		return "redirect:/evaluation";
	}

	// save
	@PostMapping("/danhgia/save")
	public String savekhoa(@Valid DanhGiaDto dgdto, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "comp/danhgia";
		}
		dgs.saveOrUpdate(new DanhGia(dgdto.getDanhgiaid(), dgdto.getSao(), dgdto.getNoidung()));
		redirect.addFlashAttribute("success", "Saved successfully!");
		return "redirect:/evaluation";
	}
}
