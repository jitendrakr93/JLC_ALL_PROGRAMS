package com.jlcindia.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class JLCListener {
	@EventListener
	public void onApplicationEvent(ApplicationEvent event){
		System.out.println("\nJLCListener -> onApplicationEvent");
		if(event instanceof BatchEvent){
			System.out.println("\nBatch event is raised");
			BatchEvent batchEvent=(BatchEvent) event;
			Batch bat=batchEvent.getBatch();
			System.out.println(bat);
		}else if(event instanceof WorkshopEvent){
			System.out.println("\nWorkshop Event is raised");
			WorkshopEvent wsEvent=(WorkshopEvent) event;
			WorkShop ws=wsEvent.getWorkshop();
			System.out.println(ws);
		}else{
			System.out.println(event);
		}
	}
	
	@EventListener
	public void handleBatchEvent(BatchEvent event){
		System.out.println("\nJLCListener->handleBatchEvent");
		System.out.println("\nBatch event is Raised");
		System.out.println(event.getBatch());
	}
	
	@EventListener
	public void handleWorkshopEvent(WorkshopEvent event){
		System.out.println("\nJLCListener->handleWorkshopEvent");
		System.out.println("\nWorkshopEvent  is Raised");
		System.out.println(event.getWorkshop());
	}
	@EventListener
	public void handleHelloEvent(HelloEvent event){
		System.out.println("\nJLCListener->handleHelloEvent");
		System.out.println("\nHelloEvent  is Raised");
		event.show();
	}
}
