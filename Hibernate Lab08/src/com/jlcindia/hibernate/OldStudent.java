package com.jlcindia.hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="OSTU")
public class OldStudent extends Student{
	private String occompany;
	private String ocemail;
	private double octc;
	public OldStudent() {
		
	}
	public OldStudent(String sname, String city, String status, double totalfee, String occompany, String ocemail,
			double octc) {
		super(sname, city, status, totalfee);
		this.occompany = occompany;
		this.ocemail = ocemail;
		this.octc = octc;
	}
	public OldStudent(int sid, String sname, String city, String status, double totalfee, String occompany,
			String ocemail, double octc) {
		super(sid, sname, city, status, totalfee);
		this.occompany = occompany;
		this.ocemail = ocemail;
		this.octc = octc;
	}
	public String getOccompany() {
		return occompany;
	}
	public void setOccompany(String occompany) {
		this.occompany = occompany;
	}
	public String getOcemail() {
		return ocemail;
	}
	public void setOcemail(String ocemail) {
		this.ocemail = ocemail;
	}
	public double getOctc() {
		return octc;
	}
	public void setOctc(double octc) {
		this.octc = octc;
	}
	@Override
	public String toString() {
		return super.toString() + occompany + "\t" + ocemail + "\t" + octc;
	}
	
	
}
