package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.web.service.LoginService;
import com.springboot.web.service.RegisterService;

@Controller
@SessionAttributes({"name", "password"})
public class RegisterController {
	
	@Autowired
	RegisterService service;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String showIndex(){
		return "index";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String showRegisterPage(){
		return "register";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String postRegisterPage(@RequestParam String name, @RequestParam String pass){

		service.register(name, pass);
		
		return "redirect:/";
	}

}
