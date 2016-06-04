package com.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.models.User;


public interface UserRepository extends CrudRepository<User, Serializable>{
	User findByName(String name);
	


}
