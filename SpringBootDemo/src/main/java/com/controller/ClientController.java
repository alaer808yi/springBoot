package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models2.User2;
import com.repository2.UserRepository2;






@RestController
@RequestMapping("/getclient")
@Configuration
public class ClientController {

	@Autowired
	UserRepository2 userRepository2;
	
	@RequestMapping("/{name}")
	public String deal(@PathVariable("name") String name){
		System.out.println("get "+ name);
		
		return name+"---> OK";
		
	}
	@RequestMapping("/testmutipleDatasource")
	public User2 getUser2(){
		return userRepository2.findByName("sadf");
	}
	
	

}
