package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Required;

public class Hello {
	private A aobj;
	private B bobj;
	
	@Required
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	@Required
	public void setBobj(B bobj) {
		this.bobj = bobj;
	}
	public void show(){
		System.out.println(aobj);
		System.out.println(bobj);
	}
	
	
}
