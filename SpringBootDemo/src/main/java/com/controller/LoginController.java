package com.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.models.User;



@RestController
@RequestMapping("/login")
@Configuration
public class LoginController {
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public void login(@ModelAttribute("userBean") User user){
		
		System.out.println("Ok : "+user.getName()+"--"+user.getPassword());
	}
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public void login0(@ModelAttribute("userBean") User user){
		
		System.out.println("Ok : "+user.getName()+"--"+user.getPassword());
	}

}
