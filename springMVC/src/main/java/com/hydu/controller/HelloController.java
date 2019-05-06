package com.hydu.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	String message="Welcome to Spring MVC!";

	@RequestMapping(value="/hello")
	public ModelAndView Hello(@RequestParam(value = "name", required = false, defaultValue = "Spring") String name) throws Exception {
		ModelAndView modelAndView=new ModelAndView("hello");//÷∏∂® ”Õº
		
		modelAndView.addObject("message",message);
		modelAndView.addObject("name",name);
		return modelAndView;
	}

}
