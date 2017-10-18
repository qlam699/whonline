package com.donglam.webhoconline.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.donglam.webhoconline.model.Khoa;
import com.donglam.webhoconline.model.KhoaDto;
import com.donglam.webhoconline.model.KhoaHoc;
import com.donglam.webhoconline.model.KhoaHocDto;
import com.donglam.webhoconline.model.LoaiKhoaHoc;
import com.donglam.webhoconline.model.LoaiKhoaHocDto;
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

	/* Paging */
	@GetMapping("/courses")
	public String courses(HttpServletRequest request) {
		request.getSession().setAttribute("courses", null);
		return "redirect:/courses/page/1";
	}

	@GetMapping("/courses/page/{pageNumber}")
	public String showCoursesPage(HttpServletRequest request,@PathVariable int pageNumber, Model model) {
		PagedListHolder<?> pages=(PagedListHolder<?>)request.getSession().getAttribute("courses");
		int pagesize=3;
		List<KhoaHoc> list=khs.getList();
		if(pages==null) {
			pages=new PagedListHolder<>(list);
			pages.setPageSize(pagesize);
		}else {
			final int goToPage=pageNumber-1;
			if(goToPage<=pages.getPageCount()&&goToPage>=0) {
				pages.setPage(goToPage);
			}
		}
		request.getSession().setAttribute("courses", pages);
		int current =pages.getPage()+1;
		int begin = Math.max(1,current-list.size());
		int end = Math.min(begin + 5, pages.getPageCount());
		int totalPageCount=pages.getPageCount();
		String baseUrl="/courses/page/";
		
		model.addAttribute("beginIndex",begin);
		model.addAttribute("endIndex",end);
		model.addAttribute("currentIndex",current);
		model.addAttribute("totalPageCount",totalPageCount);
		model.addAttribute("baseUrl",baseUrl);
		model.addAttribute("dskh",pages);
		
		return "courses";
	}
	/* Paging */

	// message is delete
	@GetMapping("/isdelete")
	public String isdelete(Model model) {
		// model.addAttribute("id", id);
		return "comp/isdelete";
	}

	// manager courses
	@GetMapping("/adcourse")
	public String adcourse(Model model) {
		model.addAttribute("dskh", khs.getList());
		model.addAttribute("dskhoa", ks.getList());
		model.addAttribute("dsloaikh", lkhs.getList());

		return "adcourse";
	}

	// -------------------------------- KHOA

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

	// delete
	@GetMapping("/khoa/{id}/delete")
	public String deletekhoa(@PathVariable String id, RedirectAttributes redirect) {
		Khoa k = ks.get(id);
		if (k == null) {
			redirect.addFlashAttribute("success", "Delete Failed!");
			return "redirect:/adcourse";
		}
		ks.delete(k);
		redirect.addFlashAttribute("success", "Deleted successfully!");
		return "redirect:/adcourse";
	}

	// save
	@PostMapping("/khoa/save")
	public String savekhoa(@Valid KhoaDto kdto, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "comp/khoa";
		}
		ks.saveOrUpdate(new Khoa(null, kdto.getMakhoa(), kdto.getTenkhoa()));
		redirect.addFlashAttribute("success", "Saved successfully!");
		return "redirect:/adcourse";
	}

	// ------------------------------ LOAI KH

	// create
	@GetMapping("/loaikh/create")
	public String createloaikh(Model model) {
		model.addAttribute("loaikh", new LoaiKhoaHoc());
		model.addAttribute("listkhoa", ks.getList());
		return "comp/loaikh";
	}

	// edit
	@GetMapping("/loaikh/{id}/edit")
	public String editloaikh(@PathVariable String id, Model model) {
		model.addAttribute("loaikh", lkhs.get(id));
		model.addAttribute("listkhoa", ks.getList());
		return "comp/loaikh";
	}

	// delete
	@GetMapping("/loaikh/{id}/delete")
	public String deleteloaikh(@PathVariable String id, RedirectAttributes redirect) {
		LoaiKhoaHoc lkh = lkhs.get(id);
		if (lkh == null) {
			redirect.addFlashAttribute("success", "Delete Failed!");
			return "redirect:/adcourse";
		}
		lkhs.delete(lkh);
		redirect.addFlashAttribute("success", "Deleted successfully!");
		return "redirect:/adcourse";
	}

	// save
	@PostMapping("/loaikh/save")
	public String saveloaikh(@Valid LoaiKhoaHocDto lkhdto, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "comp/loaikh";
		}
		lkhs.saveOrUpdate(new LoaiKhoaHoc(lkhdto.getKhoa(), lkhdto.getKhoahocs(), lkhdto.getMaloaikh(), lkhdto.getTenloaikh()));
		redirect.addFlashAttribute("success", "Saved successfully!");
		return "redirect:/adcourse";
	}

	// -------------------------------- KHOA HOC

	// create
	@GetMapping("/khoahoc/create")
	public String createkhoahoc(Model model) {
		model.addAttribute("khoahoc", new KhoaHoc());
		model.addAttribute("listloaikh", lkhs.getList());
		return "comp/khoahoc";
	}

	// edit
	@GetMapping("/khoahoc/{id}/edit")
	public String editkhoahoc(@PathVariable String id, Model model) {
		model.addAttribute("khoahoc", khs.get(id));
		model.addAttribute("listloaikh", lkhs.getList());
		return "comp/khoahoc";
	}

	// delete
	@GetMapping("/khoahoc/{id}/delete")
	public String deletekhoahoc(@PathVariable String id, RedirectAttributes redirect) {
		KhoaHoc kh = khs.get(id);
		if (kh == null) {
			redirect.addFlashAttribute("success", "Delete Failed!");
			return "redirect:/adcourse";
		}
		khs.delete(kh);
		redirect.addFlashAttribute("success", "Deleted successfully!");
		return "redirect:/adcourse";
	}

	// save
	@PostMapping("/khoahoc/save")
	public String savekhoahoc(@Valid KhoaHocDto khdto, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "comp/khoahoc";
		}
		KhoaHoc kh = new KhoaHoc(null, khdto.getLoaikhoahoc(), khdto.getMakh(), khdto.getTenkh(), khdto.getGiobd(),
				khdto.getGiokt(), khdto.getTgbdhoc(), khdto.getTgkthoc(), khdto.getTgbddk(), khdto.getTgktdk(),
				khdto.getHocphi(), khdto.getMota(), khdto.getHinh(), khdto.isDaduyet());
		khs.saveOrUpdate(kh);
		redirect.addFlashAttribute("success", "Saved successfully!");
		return "redirect:/adcourse";
	}

}
