package com.itsol.back.service;

import com.itsol.back.dao.ProductDao;
import com.itsol.back.model.Product;

public class ProductServiceImpl implements ProductService{
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao){
		this.productDao = productDao;
	}
	public ProductDao getProductDao(){
		return this.productDao;
	}
	public void save(Product product){
		productDao.save(product);
	}
}