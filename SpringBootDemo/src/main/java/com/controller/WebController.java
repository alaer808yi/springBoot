package com.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/serach")
@Configuration
public class WebController {
	
	@RequestMapping("/1")
	public  String getString(){
		return "lijianyuan";
	}

}
