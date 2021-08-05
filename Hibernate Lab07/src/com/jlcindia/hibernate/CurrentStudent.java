package com.jlcindia.hibernate;

public class CurrentStudent extends Student{
	private double feebal;
	private String timings;
	private String branch;
	public CurrentStudent() {
		// TODO Auto-generated constructor stub
	}
	public CurrentStudent(String sname, String city, String status, double totalfee, double feebal, String timings,
			String branch) {
		super(sname, city, status, totalfee);
		this.feebal = feebal;
		this.timings = timings;
		this.branch = branch;
	}
	public CurrentStudent(int sid, String sname, String city, String status, double totalfee, double feebal,
			String timings, String branch) {
		super(sid, sname, city, status, totalfee);
		this.feebal = feebal;
		this.timings = timings;
		this.branch = branch;
	}
	public double getFeebal() {
		return feebal;
	}
	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return super.toString()+"\t"+ feebal + "\t" + timings + "\t" + branch;
	}
	
	
}
