package com.itsol.back.dao;

import com.itsol.back.model.Category;
import com.itsol.core.dao.BaseDao;

public class CategoryDaoImpl extends BaseDao implements CategoryDao{
	public void save(Category category){
		getHibernateTemplate().save(category);
	}
}