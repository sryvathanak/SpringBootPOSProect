package com.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.model.Category;
import com.pos.repository.CategoryRepository;

@Service
public class CategoryServiceImp implements CategoryService {
     
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category saveCategory(Category category) {
		
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> getAllCategorys() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	
	
	
}
