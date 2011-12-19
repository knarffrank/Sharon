package com.itsol.back.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.itsol.back.model.User;
import com.itsol.core.dao.BaseDao;

public class UserDaoImpl extends BaseDao implements  UserDao{

	@Override
	public void save(User user) {
		getHibernateTemplate().save(user);
	}
	
	public User findById(String id){
		return (User)getHibernateTemplate().get(User.class, id);
	}
	public User findByEmail(String email){
		Criteria criteria = getCriteria(User.class).add(Restrictions.eq("email", email));
		return (User)criteria.uniqueResult();
	}
}
