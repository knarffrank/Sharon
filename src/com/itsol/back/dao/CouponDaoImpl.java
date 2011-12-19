package com.itsol.back.dao;

import com.itsol.back.model.Coupon;
import com.itsol.core.dao.BaseDao;

public class CouponDaoImpl extends BaseDao implements CouponDao{
	public void save(Coupon coupon){
		getHibernateTemplate().save(coupon);
	}
}