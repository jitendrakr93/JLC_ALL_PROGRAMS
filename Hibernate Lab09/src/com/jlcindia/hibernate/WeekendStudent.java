package com.jlcindia.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="westudents1")
public class WeekendStudent extends CurrentStudent{
	private String wcompany;
	private String wcemail;
	private double wctc;
	public WeekendStudent() {
		// TODO Auto-generated constructor stub
	}
	public WeekendStudent(String sname, String city, String status, double totalfee, double feebal, String timings,
			String branch, String wcompany, String wcemail, double wctc) {
		super(sname, city, status, totalfee, feebal, timings, branch);
		this.wcompany = wcompany;
		this.wcemail = wcemail;
		this.wctc = wctc;
	}
	public WeekendStudent(int sid, String sname, String city, String status, double totalfee, double feebal,
			String timings, String branch, String wcompany, String wcemail, double wctc) {
		super(sid, sname, city, status, totalfee, feebal, timings, branch);
		this.wcompany = wcompany;
		this.wcemail = wcemail;
		this.wctc = wctc;
	}
	public String getWcompany() {
		return wcompany;
	}
	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}
	public String getWcemail() {
		return wcemail;
	}
	public void setWcemail(String wcemail) {
		this.wcemail = wcemail;
	}
	public double getWctc() {
		return wctc;
	}
	public void setWctc(double wctc) {
		this.wctc = wctc;
	}
	@Override
	public String toString() {
		return super.toString()+"\t"+ wcompany +"\t"+wcemail+"\t"+ wctc;
	}
	
}
