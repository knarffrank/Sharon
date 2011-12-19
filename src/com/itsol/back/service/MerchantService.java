package com.itsol.back.service;

import java.util.List;

import com.itsol.back.model.Merchant;

public interface MerchantService{
	public void save(Merchant merchant);
	public List<Merchant> findAll();
}