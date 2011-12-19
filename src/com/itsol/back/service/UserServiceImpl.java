package com.itsol.back.service;

import java.util.Date;

import com.itsol.back.dao.UserDao;
import com.itsol.back.model.User;
import com.itsol.core.util.Message;
import com.itsol.core.util.Tools;
import com.itsol.exception.UserExistException;

public class UserServiceImpl implements UserService{
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void save(User user){
		User userDb = userDao.findByEmail(user.getEmail().toLowerCase());
		if(userDb == null){
			user.setEmail(user.getEmail().toLowerCase());
			user.setId(Tools.getUUID());
			user.setDateAdded(new Date());
			user.setPassword(Tools.md5(user.getPassword()));
			userDao.save(user);
		}else{
			throw new UserExistException(Message.get("User-Already-Exist"));
		}
	}
}
