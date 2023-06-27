package com.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.pos.model.Category;
import com.pos.service.CategoryServiceImp;

@Controller
@RequestMapping("")
public class CategoryController {
	
	@Autowired
	private CategoryServiceImp categoryServiceImp;
	
	@GetMapping("/categorys")
	  public String categorys(Model model) {
		model.addAttribute("categorys", categoryServiceImp.getAllCategorys());
	    return "categorys";
	  }
	
	@GetMapping("/categorys/new")
	public String createCategory(Model model) {
		
		
		Category category = new Category();
		model.addAttribute("category", category);
		return "saveCategory";
		
	}
	@PostMapping("/categorys")
	public String saveCategory(@ModelAttribute("category") Category category) 
	{
		categoryServiceImp.saveCategory(category);
		return "redirect:/categorys";
	}
}
