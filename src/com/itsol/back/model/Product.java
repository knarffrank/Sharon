package com.itsol.back.model;

import java.util.Date;

import com.itsol.core.model.BaseModel;

public class Product extends BaseModel{
	private String merchantId;
	private String cd;
	private String brand;
	private String subCategoryId;
	private String name;
	private String desc;
	private String color;
	private int heightCm;
	private int lengthCm;
	private int widthCm;
	private double price;
	private int condition; //0-new; 1-used
	private boolean isEnabled;
	private Date startDate;
	private Date endDate;
	private int quantity;
	private int sellingQuantity;
}