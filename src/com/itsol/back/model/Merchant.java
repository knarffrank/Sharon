package com.itsol.back.model;

import com.itsol.core.model.BaseModel;

public class Merchant extends BaseModel{
	private int status;
	private String name;
	private String desc;
	private String ccType;
	private String ccOwner;
	private String ccNumber;
	private String ccExpires;
	private String ccCvv;
	private String currencyId;
	private String countryId;
	private String languageId;
	private String email;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCcType() {
		return ccType;
	}
	public void setCcType(String ccType) {
		this.ccType = ccType;
	}
	public String getCcOwner() {
		return ccOwner;
	}
	public void setCcOwner(String ccOwner) {
		this.ccOwner = ccOwner;
	}
	public String getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCcExpires() {
		return ccExpires;
	}
	public void setCcExpires(String ccExpires) {
		this.ccExpires = ccExpires;
	}
	public String getCcCvv() {
		return ccCvv;
	}
	public void setCcCvv(String ccCvv) {
		this.ccCvv = ccCvv;
	}
	public String getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getLanguageId() {
		return languageId;
	}
	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}