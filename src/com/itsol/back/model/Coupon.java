package com.itsol.back.model;

import java.util.Date;

import com.itsol.core.model.BaseModel;

public class Coupon extends BaseModel{
	private int lessPercent;
	private Date startDate;
	private Date endDate;
	private String name;
	private String desc;
}