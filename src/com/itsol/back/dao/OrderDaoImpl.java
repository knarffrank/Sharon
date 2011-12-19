package com.itsol.back.dao;

import com.itsol.back.model.Order;
import com.itsol.core.dao.BaseDao;

public class OrderDaoImpl extends BaseDao implements OrderDao{
	public void save(Order order){
		getHibernateTemplate().save(order);
	}
}