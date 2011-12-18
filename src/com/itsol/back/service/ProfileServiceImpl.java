package com.itsol.back.service;

import java.util.Date;

import com.itsol.back.dao.ProfileDao;
import com.itsol.back.model.Profile;
import com.itsol.core.util.Message;
import com.itsol.core.util.Tools;
import com.itsol.exception.ProfileExistException;
import com.itsol.exception.ProfilePasswordException;

public class ProfileServiceImpl implements ProfileService{
	private ProfileDao profileDao;

	public ProfileDao getProfileDao() {
		return profileDao;
	}

	public void setProfileDao(ProfileDao profileDao) {
		this.profileDao = profileDao;
	}
	public void save(Profile profile){
		Profile profileDb = profileDao.findByEmail(profile.getEmail().toLowerCase());
		if(profileDb == null){
			profile.setEmail(profile.getEmail().toLowerCase());
			profile.setId(Tools.getUUID());
			profile.setDateAdded(new Date());
			profile.setPassword(Tools.md5(profile.getPassword()));
			profileDao.save(profile);
		}else{
			throw new ProfileExistException(Message.get("Profile-Already-Exist"));
		}
	}
}
