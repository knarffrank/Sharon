package com.itsol.back.dao;

import java.util.List;

import com.itsol.back.model.Role;


public interface RoleDao {
	public void save(Role role);
	public List<Role> findAll();
	public Role findById(String id);
	public Role findByName(String name);
}
