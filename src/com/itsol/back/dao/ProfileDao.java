package com.itsol.back.dao;

import com.itsol.back.model.Profile;

public interface ProfileDao {
	public void save(Profile profile);
	public Profile findById(String id);
	public Profile findByEmail(String email);
}
