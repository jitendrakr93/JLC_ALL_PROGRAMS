package com.jlcindia.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value="/hello")
	public String showHello(){
		System.out.println("** showHello **");
		return "hello";
	}
	
	@RequestMapping(value="/hai")
	public String showHai(){
		System.out.println("** showHai **");
		return "hai";
	}
	
	@RequestMapping(value="/hellohai")
	public String showHelloHai(){
		System.out.println("** showHelloHai **");
		return "hellohai";
	}
}
