package com.jlcindia.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class JLCListener1 implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof BatchEvent){
			BatchEvent batchEvent=(BatchEvent) event;
			Batch batch=batchEvent.getBatch();
			System.out.println(batch);
		}
		else if(event instanceof WorkshopEvent){
			WorkshopEvent wsEvent=(WorkshopEvent) event;
			WorkShop ws=wsEvent.getWorkshop();
			System.out.println(ws);
		}else{
			System.out.println(event);
		}
	}

}
