package com.itsol.back.service;

import com.itsol.back.dao.SubCategoryDao;
import com.itsol.back.model.SubCategory;


public class SubCategoryServiceImpl implements SubCategoryService{
	private SubCategoryDao subCategoryDao;
	public void setSubCategoryDao(SubCategoryDao subCategoryDao){
		this.subCategoryDao = subCategoryDao;
	}
	public SubCategoryDao getSubCategoryDao(){
		return this.subCategoryDao;
	}
	public void save(SubCategory subCategory){
		subCategoryDao.save(subCategory);
	}
}