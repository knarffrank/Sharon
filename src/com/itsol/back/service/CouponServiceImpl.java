package com.itsol.back.service;

import com.itsol.back.dao.CouponDao;
import com.itsol.back.model.Coupon;

public class CouponServiceImpl implements CouponService{
	private CouponDao couponDao;
	
	public CouponDao getCouponDao() {
		return couponDao;
	}

	public void setCouponDao(CouponDao couponDao) {
		this.couponDao = couponDao;
	}

	public void save(Coupon coupon) {
		couponDao.save(coupon);
	}

}