package com.jlcindia.hibernate;

public class Customer {
	private String cid;
	private String cname;
	private String email;
	private long phone;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String cname, String email, long phone) {
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

	public Customer(String cid, String cname, String email, long phone) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
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
		return cid + "\t" + cname + "\t" + email + "\t" + phone;
	}

}
