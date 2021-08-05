package com.jlcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="requests")
public class Request {
	@Id
	@Column(name="reqId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reqId;
	
	@Column(name="reqDate")
	private String reqDate;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name="cid",referencedColumnName="cid")
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
