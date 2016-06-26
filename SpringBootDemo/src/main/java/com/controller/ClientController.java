package com.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.WebJarsResourceResolver;





@RestController
@RequestMapping("/getclient")
@Configuration
public class ClientController {
	
	@RequestMapping("/{name}")
	public String deal(@PathVariable("name") String name){
		System.out.println("get "+ name);
		
		return name+"---> OK";
		
	}

}
