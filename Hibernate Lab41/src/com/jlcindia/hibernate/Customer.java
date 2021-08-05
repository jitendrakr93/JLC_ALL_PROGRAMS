package com.jlcindia.hibernate;

public class Customer {
	private String customerId;
	private String cid;
	private String cname;
	private String email;
	private long phone;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String cid, String cname, String email, long phone) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

	public Customer(String customerId, String cid, String cname, String email, long phone) {
		this.customerId = customerId;
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return customerId + "\t" + cid + "\t" + cname + "\t" + email + "\t" + phone;
	}}
