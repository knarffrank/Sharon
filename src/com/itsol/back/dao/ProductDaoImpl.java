package com.itsol.back.dao;

import com.itsol.back.model.Product;
import com.itsol.core.dao.BaseDao;

public class ProductDaoImpl extends BaseDao implements ProductDao{
	public void save(Product product){
		getHibernateTemplate().save(product);
	}
}