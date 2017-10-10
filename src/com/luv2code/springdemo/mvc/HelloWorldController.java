package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// a new controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String studentNameToUpperCase(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form and convert to uppercase
		String studentNameToUpper = "Yo! " + request.getParameter("studentName").toUpperCase() + "!";
		
		// add the message to the model
		model.addAttribute("message", studentNameToUpper);
		
		// pass this on helloworld page
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processformVersionThree(@RequestParam("studentName") String studentNameToUpper, Model model) {
		
		// read the request parameter from the HTML form and convert to uppercase
	     studentNameToUpper = "Hey my friend from v3! " + studentNameToUpper.toUpperCase() + "!";
		
		// add the message to the model
		model.addAttribute("message", studentNameToUpper);
		
		// pass this on helloworld page
		return "helloworld";
	}

}
