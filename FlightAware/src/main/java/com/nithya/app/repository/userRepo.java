package com.nithya.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nithya.app.model.User;
import com.nithya.app.model.UserIp;

@Repository
public interface userRepo extends CrudRepository<User,Long>{
	User findByEmailIdIgnoreCase(String emailId);

}