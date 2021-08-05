package com.jlcindia.spring;

public class Batch {
	String bid;
	String sd;
	String timings;
	int nos;
	public Batch(String bid, String sd, String timings, int nos) {
		this.bid = bid;
		this.sd = sd;
		this.timings = timings;
		this.nos = nos;
	}
	public String toString(){
		String msg="JLC Anno....New Batch";
		msg=msg+"\n batch Id "+bid;
		msg=msg+"\n Start date "+sd;
		msg=msg+"\n Timings "+timings;
		msg=msg+"\n No Of Seats "+nos;
		return msg;
	}
}
