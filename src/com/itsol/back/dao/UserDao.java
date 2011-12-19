package com.itsol.back.dao;

import com.itsol.back.model.User;

public interface UserDao {
	public void save(User user);
	public User findById(String id);
	public User findByEmail(String email);
}
