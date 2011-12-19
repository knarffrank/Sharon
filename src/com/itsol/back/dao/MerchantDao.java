package com.itsol.back.dao;

import java.util.List;

import com.itsol.back.model.Merchant;

public interface MerchantDao{
	public void save(Merchant merchant);
	public List<Merchant> findAll();
	public Merchant findByName(String name);
}