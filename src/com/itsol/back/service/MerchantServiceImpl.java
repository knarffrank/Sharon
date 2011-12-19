package com.itsol.back.service;

import java.util.Date;
import java.util.List;

import com.itsol.back.dao.MerchantDao;
import com.itsol.back.dao.UserDao;
import com.itsol.back.model.Merchant;
import com.itsol.back.model.User;
import com.itsol.back.resource.ConstantsFactory;
import com.itsol.core.util.Message;
import com.itsol.core.util.Tools;
import com.itsol.exception.MerchantExistException;

public class MerchantServiceImpl implements MerchantService{
	private MerchantDao merchantDao;
	private UserDao userDao;
	
	public void save(Merchant merchant){
		Merchant merchantDb = merchantDao.findByName(merchant.getName().toUpperCase());
		if(merchantDb == null){
			merchant.setEmail(merchant.getEmail().toLowerCase());
			merchant.setId(Tools.getUUID());
			merchant.setDateAdded(new Date());
			merchant.setStatus(ConstantsFactory.MERCHANT_INACTIVE);
			merchant.setName(merchant.getName().toUpperCase());
			
			User user = new User();
			user.setId(Tools.getUUID());
			user.setDateAdded(new Date());
			user.setFirstName(ConstantsFactory.ADMIN);
			user.setLastName(ConstantsFactory.ADMIN);
			user.setEmail(merchant.getEmail());
			user.setPassword(Tools.md5(ConstantsFactory.ADMIN));
			user.setMerchantId(merchant.getId());
			merchantDao.save(merchant);
			userDao.save(user);
		}else{
			throw new MerchantExistException(Message.get("Merchant-Already-Exist"));
		}
	}
	public List<Merchant> findAll() {
		return merchantDao.findAll();
	}
	//-- Getters and Setters
	public void setMerchantDao(MerchantDao merchantDao){
		this.merchantDao = merchantDao;
	}
	public MerchantDao getMerchantDao(){
		return this.merchantDao;
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}