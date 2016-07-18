package com.repository2;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.models2.User2;

@Repository
public interface UserRepository2 extends CrudRepository<User2, Serializable>{
	User2 findByName(String name);
	


}
