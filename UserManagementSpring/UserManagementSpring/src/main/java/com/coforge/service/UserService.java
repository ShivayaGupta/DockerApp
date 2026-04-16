package com.coforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coforge.dao.UserDao;
import com.coforge.entity.User;
@Service
@Repository
public class UserService {
	@Autowired
   UserDao userdao;
	public List<User> getAllUser(){
		return userdao.getAllUser();
	}
	
	public User addUser(User user) {
		return userdao.addUser(user);
	}
	
	public User getUserId(Long userId) {
		return userdao.getByUserId(userId).orElseThrow(()->new RuntimeException());
	}	

}
