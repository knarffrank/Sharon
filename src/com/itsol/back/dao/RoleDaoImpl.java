package com.itsol.back.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.itsol.back.model.Role;
import com.itsol.core.dao.BaseDao;


public class RoleDaoImpl extends BaseDao implements RoleDao{

	public void save(Role role) {
		getHibernateTemplate().save(role);
	}

	public List<Role> findAll(){
		Criteria criteria = getCriteria(Role.class);
		return criteria.list();
	}
	
	public Role findById(String id){
		return (Role)getHibernateTemplate().get(Role.class, id);
	}
	public Role findByName(String name){
		return (Role)getCriteria(Role.class).add(Restrictions.eq("name", name)).uniqueResult();
	}
}
