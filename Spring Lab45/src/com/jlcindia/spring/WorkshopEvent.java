package com.jlcindia.spring;

import org.springframework.context.ApplicationEvent;

public class WorkshopEvent extends ApplicationEvent{
	WorkShop ws;
	public WorkshopEvent(Object source,WorkShop ws) {
		super(source);
		this.ws=ws;
	}
public WorkShop getWorkshop(){
	return ws;
}

}
