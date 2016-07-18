package com.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService{

	public String testSay(){
		return "it work!";
	}

	
	
	
}
