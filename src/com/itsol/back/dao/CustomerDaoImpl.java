package com.itsol.back.dao;

import com.itsol.back.model.Customer;
import com.itsol.core.dao.BaseDao;

public class CustomerDaoImpl extends BaseDao implements CustomerDao{
	public void save(Customer customer){
		getHibernateTemplate().save(customer);
	}
}