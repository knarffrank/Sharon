package com.itsol.back.model;

import java.util.List;

import com.itsol.core.model.BaseModel;

public class Order extends BaseModel{
	private List<Product> products;
	private String couponId;
	private String customerId;
	private String shippingId;
	private String paymentId;
	private double totalPrice;
	private double tax;
	private int status;
}