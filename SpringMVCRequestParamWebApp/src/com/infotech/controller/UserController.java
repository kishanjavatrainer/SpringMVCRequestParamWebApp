package com.infotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.model.User;

@Controller
public class UserController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String registerPage(){
		return "register";
	}
	
	@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public ModelAndView registerSuccess(@RequestParam("name") String userName,@RequestParam("country") String country,@RequestParam(required=false,name="email") String email,@RequestParam(name="age") int age){
		User user = new User(userName, age, email, country);
		ModelAndView modelAndView = new ModelAndView("registerSuccess");
		modelAndView.addObject("user", user);
		
		return modelAndView;
	}
	
	/*@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public ModelAndView registerSuccess(@RequestParam("name") String userName,@RequestParam("country") String country,@RequestParam("email") String email,@RequestParam("age") int age){
		User user = new User(userName, age, email, country);
		ModelAndView modelAndView = new ModelAndView("registerSuccess");
		modelAndView.addObject("user", user);
		
		return modelAndView;
		
	}*/
}
