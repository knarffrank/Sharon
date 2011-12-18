package com.itsol.back.service;

import java.util.List;

import com.itsol.back.model.Role;

public interface RoleService {
	public void save(Role role);
	public List<Role> findAll();
	public Role findById(String id);
}
