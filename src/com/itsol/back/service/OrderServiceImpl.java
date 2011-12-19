package com.itsol.back.service;

import com.itsol.back.dao.OrderDao;
import com.itsol.back.model.Order;

public class OrderServiceImpl implements OrderService{
	private OrderDao orderDao;
	public void setOrderDao(OrderDao orderDao){
		this.orderDao = orderDao;
	}
	public OrderDao getOrderDao(){
		return this.orderDao;
	}
	public void save(Order order){
		orderDao.save(order);
	}
}