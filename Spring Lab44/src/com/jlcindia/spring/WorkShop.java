package com.jlcindia.spring;

public class WorkShop {
	String topic;
	double fee;
	int nos;
	public WorkShop(String topic, double fee, int nos) {
		this.topic = topic;
		this.fee = fee;
		this.nos = nos;
	}
	public String toString(){
		String msg="JLC Anno....New WorkShop";
		msg=msg+"\n topic "+topic;
		msg=msg+"\n fee "+fee;
		msg=msg+"\n No Of Seats "+nos;
		return msg;
	}
}
