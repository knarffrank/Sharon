package com.itsol.back.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.itsol.back.model.Merchant;
import com.itsol.back.model.Role;
import com.itsol.core.dao.BaseDao;

public class MerchantDaoImpl extends BaseDao implements MerchantDao{
	public void save(Merchant merchant){
		getHibernateTemplate().save(merchant);
	}

	public List<Merchant> findAll(){
		Criteria criteria = getCriteria(Merchant.class);
		return criteria.list();
	}

	public Merchant findByName(String name){
		Criteria critera = getCriteria(Merchant.class);
		return (Merchant)critera.add(Restrictions.eq("name", name)).uniqueResult();
	}

}