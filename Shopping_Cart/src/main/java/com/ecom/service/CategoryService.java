package com.ecom.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ecome.model.Category;

public interface CategoryService {

	public Category saveCategory(Category category);
	
	public Boolean existCategory(String name);
	
	public List<Category> getAllCategories();
	
	public Boolean deleteCategory(int id);
	
	public Category getCategoryById(int id);
	
	public List<Category> getAllActiveCategory();
	
	public Page<Category> getAllCategoryPagination(Integer pageNo, Integer pageSize);
	
}
