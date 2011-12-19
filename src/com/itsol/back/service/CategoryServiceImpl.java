package com.itsol.back.service;

import com.itsol.back.dao.CategoryDao;
import com.itsol.back.model.Category;

public class CategoryServiceImpl implements CategoryService{
	private CategoryDao categoryDao;
	public void setCategoryDao(CategoryDao categoryDao){
		this.categoryDao = categoryDao;
	}
	public CategoryDao getCategoryDao(){
		return this.categoryDao;
	}
	public void save(Category category){
		categoryDao.save(category);
	}
}