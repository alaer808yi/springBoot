package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Transactional
@Service
public class UserServiceTemplate {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List findAll(){
		return jdbcTemplate.queryForList("select * from user");
	}
	

}
