package com.itsol.back.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.itsol.back.model.Profile;
import com.itsol.core.dao.BaseDao;

public class ProfileDaoImpl extends BaseDao implements  ProfileDao{

	@Override
	public void save(Profile profile) {
		getHibernateTemplate().save(profile);
	}
	
	public Profile findById(String id){
		return (Profile)getHibernateTemplate().get(Profile.class, id);
	}
	public Profile findByEmail(String email){
		Criteria criteria = getCriteria(Profile.class).add(Restrictions.eq("email", email));
		return (Profile)criteria.uniqueResult();
	}
}
