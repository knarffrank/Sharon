package com.itsol.back.service;

import java.util.Date;
import java.util.List;

import com.itsol.back.dao.RoleDao;
import com.itsol.back.model.Profile;
import com.itsol.back.model.Role;
import com.itsol.core.util.Message;
import com.itsol.core.util.Tools;
import com.itsol.exception.ProfileExistException;
import com.itsol.exception.RoleExistException;

public class RoleServiceImpl implements RoleService{
	private RoleDao roleDao;

	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public void save(Role role) {
		Role roleDb = roleDao.findByName(role.getName().toUpperCase());
		if(roleDb == null){
			role.setName(role.getName().toUpperCase());
			role.setId(Tools.getUUID());
			role.setDateAdded(new Date());
			roleDao.save(role);
		}else{
			throw new RoleExistException(Message.get("Role-Already-Exist"));
		}
	}
	public List<Role> findAll(){
		return roleDao.findAll();
	}
	public Role findById(String id){
		return roleDao.findById(id);
	}
}
