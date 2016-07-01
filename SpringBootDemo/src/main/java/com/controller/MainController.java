package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.repository.LoginLogRepository;



@Controller
@RequestMapping("/manage")
@Configuration
public class MainController {

	@Autowired
	LoginLogRepository loginLogRepository;
	
	@RequestMapping("/index")
	public String getIndexPage(){

		return "default";
	}
	@RequestMapping("get")
	@ResponseBody
	public String avoid(){
		
		return "";
	}
	

}
