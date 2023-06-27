package com.pos.service;

import java.util.List;

import com.pos.model.Category;

public interface CategoryService {

	public Category saveCategory(Category category);
	public List<Category> getAllCategorys();
}
