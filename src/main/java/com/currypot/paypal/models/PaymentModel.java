package com.currypot.paypal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENTS")
public class PaymentModel {

	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
	private long id;

	@Column(name = "USERID")
	private String userId;
	
	@Column(name = "PAYPALPAYMENTID")
	private String paypalPaymentId;
	
	@Column(name = "CREATE_TIME")
	private String createTime;
	
	@Column(name = "UPDATE_TIME")
	private String updateTime;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "AMOUNT")
	private String amount;
	
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "CREATED_AT")
	private String createdAt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPaypalPaymentId() {
		return paypalPaymentId;
	}

	public void setPaypalPaymentId(String paypalPaymentId) {
		this.paypalPaymentId = paypalPaymentId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
}
