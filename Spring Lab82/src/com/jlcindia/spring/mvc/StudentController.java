package com.jlcindia.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping(value="/addstudent")
	public String addStudent(){
		System.out.println("** showing addstudent jsp **");
		return "AddStudentDef";
	}
	@RequestMapping(value="/searchstudent")
	public String searchStudent(){
		System.out.println("** showing searchstudent jsp **");
		return "SearchStudentDef";
	}
}
