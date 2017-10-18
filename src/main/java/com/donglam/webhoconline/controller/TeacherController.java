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

import com.donglam.webhoconline.model.NguoiDung;
import com.donglam.webhoconline.model.NguoiDungDto;
import com.donglam.webhoconline.service.NguoiDungService;

@Controller
public class TeacherController {

	@Autowired
	private NguoiDungService gvs;

	/* Paging */
	@GetMapping("/teachers")
	public String courses(HttpServletRequest request) {
		request.getSession().setAttribute("teachers", null);
		return "redirect:/teachers/page/1";
	}

	@GetMapping("/teachers/page/{pageNumber}")
	public String showCoursesPage(HttpServletRequest request,@PathVariable int pageNumber, Model model) {
		PagedListHolder<?> pages=(PagedListHolder<?>)request.getSession().getAttribute("teachers");
		int pagesize=3;
		List<NguoiDung> list=gvs.getListTeacher();
		if(pages==null) {
			pages=new PagedListHolder<>(list);
			pages.setPageSize(pagesize);
		}else {
			final int goToPage=pageNumber-1;
			if(goToPage<=pages.getPageCount()&&goToPage>=0) {
				pages.setPage(goToPage);
			}
		}
		request.getSession().setAttribute("teachers", pages);
		int current =pages.getPage()+1;
		int begin = Math.max(1,current-list.size());
		int end = Math.min(begin + 5, pages.getPageCount());
		int totalPageCount=pages.getPageCount();
		String baseUrl="/teachers/page/";
		
		model.addAttribute("beginIndex",begin);
		model.addAttribute("endIndex",end);
		model.addAttribute("currentIndex",current);
		model.addAttribute("totalPageCount",totalPageCount);
		model.addAttribute("baseUrl",baseUrl);
		model.addAttribute("dsgv",pages);
		
		return "teachers";
	}
	/* Paging */

	@GetMapping("/adteachers")
	public String adteachers(Model model) {
		model.addAttribute("dsgv", gvs.getListTeacher());
		return "adteachers";
	}
	
	// create
	@GetMapping("/giangvien/create")
	public String createtinnhan(Model model) {
		model.addAttribute("giangvien", new NguoiDung());
		return "comp/giangvien";
	}

	// edit
	@GetMapping("/giangvien/{id}/edit")
	public String edittinnhan(@PathVariable String id, Model model) {
		model.addAttribute("giangvien", gvs.get(id));
		return "comp/giangvien";
	}

	// delete
	@GetMapping("/giangvien/{id}/delete")
	public String deletekhoa(@PathVariable String id, RedirectAttributes redirect) {
		NguoiDung gv = gvs.get(id);
		if (gv == null) {
			redirect.addFlashAttribute("success", "Delete Failed!");
			return "redirect:/adteachers";
		}
		gvs.delete(gv);
		redirect.addFlashAttribute("success", "Deleted successfully!");
		return "redirect:/adteachers";
	}

	// save
	@PostMapping("/giangvien/save")
	public String savekhoa(@Valid NguoiDungDto nddto, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "comp/giangvien";
		}
		gvs.saveOrUpdate(new NguoiDung(nddto.getMand(), nddto.getHovatenlot(), nddto.getTen(), nddto.isPhai(),
				nddto.getNgaysinh(), nddto.getDiachi(), nddto.getCmnd(), nddto.getEmail(), nddto.getMatkhau(),
				nddto.getHinh(), nddto.getMota(), null));
		redirect.addFlashAttribute("success", "Saved successfully!");
		return "redirect:/adteachers";
	}

}
