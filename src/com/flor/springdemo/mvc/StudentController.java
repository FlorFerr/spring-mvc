package com.flor.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String studentForm(Model theModel) {
		
		Student theStudent = new Student();
		
		theModel.addAttribute("student", theStudent);
		return "studentForm";
	};
	
	@RequestMapping("/processForm")
	public String studentConfirmation(@ModelAttribute("student") Student theStudent) {
		return "studentConfirmation";
	};
}
