package com.itsol.back.model;

import com.itsol.core.model.BaseModel;

public class MerchantTxn extends BaseModel{
	private String merchantId;
	private String customerId;
	private String orderId;
	private String userId;
	private String paymentGWMethod;
	private String paymentGWOrderId;
	private String paymentGWRespCode;
	private String paymentGWTrxId;
	private String paymentGWAuthType;
	private String paymentGWSent;
	private String paymentGWRecieved;
	private String paymentGWSession;
	private double amount;
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPaymentGWMethod() {
		return paymentGWMethod;
	}
	public void setPaymentGWMethod(String paymentGWMethod) {
		this.paymentGWMethod = paymentGWMethod;
	}
	public String getPaymentGWOrderId() {
		return paymentGWOrderId;
	}
	public void setPaymentGWOrderId(String paymentGWOrderId) {
		this.paymentGWOrderId = paymentGWOrderId;
	}
	public String getPaymentGWRespCode() {
		return paymentGWRespCode;
	}
	public void setPaymentGWRespCode(String paymentGWRespCode) {
		this.paymentGWRespCode = paymentGWRespCode;
	}
	public String getPaymentGWTrxId() {
		return paymentGWTrxId;
	}
	public void setPaymentGWTrxId(String paymentGWTrxId) {
		this.paymentGWTrxId = paymentGWTrxId;
	}
	public String getPaymentGWAuthType() {
		return paymentGWAuthType;
	}
	public void setPaymentGWAuthType(String paymentGWAuthType) {
		this.paymentGWAuthType = paymentGWAuthType;
	}
	public String getPaymentGWSent() {
		return paymentGWSent;
	}
	public void setPaymentGWSent(String paymentGWSent) {
		this.paymentGWSent = paymentGWSent;
	}
	public String getPaymentGWRecieved() {
		return paymentGWRecieved;
	}
	public void setPaymentGWRecieved(String paymentGWRecieved) {
		this.paymentGWRecieved = paymentGWRecieved;
	}
	public String getPaymentGWSession() {
		return paymentGWSession;
	}
	public void setPaymentGWSession(String paymentGWSession) {
		this.paymentGWSession = paymentGWSession;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
