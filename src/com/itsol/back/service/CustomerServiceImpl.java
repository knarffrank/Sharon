package com.itsol.back.service;

import com.itsol.back.dao.CustomerDao;
import com.itsol.back.model.Customer;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao){
		this.customerDao = customerDao;
	}
	public CustomerDao getCustomerDao(){
		return this.customerDao;
	}
	public void save(Customer customer){
		customerDao.save(customer);
	}
}