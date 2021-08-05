package com.jlcindia.hibernate;

public class Request {
	private int reqId;
	private String reqDate;
	private String description;
	private String status;
	private Customer customer;

	public Request() {
		// TODO Auto-generated constructor stub
	}

	public Request(String reqDate, String description, String status) {
		this.reqDate = reqDate;
		this.description = description;
		this.status = status;
	}

	public Request(int reqId, String reqDate, String description, String status) {
		this.reqId = reqId;
		this.reqDate = reqDate;
		this.description = description;
		this.status = status;
	}

	public int getReqId() {
		return reqId;
	}

	public void setReqId(int reqId) {
		this.reqId = reqId;
	}

	public String getReqDate() {
		return reqDate;
	}

	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return reqId + "\t" + reqDate + "\t" + description + "\t" + status ;
	}

}
