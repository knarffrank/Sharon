package com.itsol.back.dao;
import com.itsol.back.model.SubCategory;
import com.itsol.core.dao.BaseDao;


public class SubCategoryDaoImpl extends BaseDao implements SubCategoryDao{
	public void save(SubCategory subCategory){
		getHibernateTemplate().save(subCategory);
	}
}