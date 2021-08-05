package com.jlcindia.spring.mvc;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class JlcExceptionHandler {
	@ExceptionHandler(StudentNotFoundException.class)
	public ModelAndView handleStudentNotFound(StudentNotFoundException exception) {
		System.out.println("----Caught StudentNotFoundException----");
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", exception.getMessage());
		mav.setViewName("sidsearch");
		return mav;
	}
	
	/*@ExceptionHandler(StudentNotFoundException.class)
	public String handleStudentNotFound1(StudentNotFoundException exception){
		System.out.println("----Caught StudentNotFoundException-----");
		return "sidsearch";
	}*/
}
