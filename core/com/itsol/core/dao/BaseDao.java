package com.itsol.core.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDao extends HibernateDaoSupport{
	public Session getCurrentSession(){
		return getHibernateTemplate().getSessionFactory().getCurrentSession();
	}
	public Criteria getCriteria(Class clazz){
		return getCurrentSession().createCriteria(clazz);
	}
}
