package com.coforge.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entity.User;
import com.coforge.service.UserService;

@RestController
@RequestMapping("/user")
public class UserContro {
	private static final Logger logger=LoggerFactory.getLogger(UserContro.class);
	@Autowired
	UserService userService;

	@GetMapping("/")
	public List<User> getAllBooking(){
		logger.info("fetching all users");
		return userService.getAllUser();
	}
	
	@PostMapping("/")
	public User addUser(@RequestBody User user) {
		logger.info("save user info[]",user);
		return userService.addUser(user);
	}
	@GetMapping("/{uId}")
	public User getBookingId(@PathVariable("uId") long uId) {
		logger.info("fetching user by user by userId",uId);

		return userService.getUserId(uId);
	}
}
