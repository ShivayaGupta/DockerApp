package com.coforge.dao;

import java.util.List;
import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.controller.UserContro;
import com.coforge.entity.User;
import com.coforge.repo.UserRepo;


@Repository
public class UserDao {
	private static final Logger logger=LoggerFactory.getLogger(UserDao.class);

	@Autowired
	UserRepo repository;
	
	public List<User> getAllUser(){
		logger.info("fetching user");
		return repository.findAll();
	}
	public User addUser(User user) {
		User user1=repository.save(user);
		logger.info("save user info[]",user1);
		return repository.save(user);
	}
	
	public Optional<User> getByUserId(long userId){
		logger.info("fetching user info of userid",userId);

		return repository.findById(userId);
	}

}
