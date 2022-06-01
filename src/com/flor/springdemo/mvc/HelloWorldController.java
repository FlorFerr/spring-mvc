package com.flor.springdemo.mvc;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	
	@RequestMapping("showForm")
	public String showForm() {
		return "helloworld-form";
		
	}
	
	@RequestMapping("processForm")
	public String processForm() {
		return "helloWorld";
		
	};
	
	@RequestMapping("processFormVT")
	public String processFormVT(@RequestParam("name") String theName, Model model) {
		
		
		
		String transformName = theName.toUpperCase();	
		
		model.addAttribute("message", transformName);
		
		return "helloWorld";
	};
	

}
