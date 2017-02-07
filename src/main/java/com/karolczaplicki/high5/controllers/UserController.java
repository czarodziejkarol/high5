package com.karolczaplicki.high5.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karolczaplicki.high5.dto.UserDTO;
import com.karolczaplicki.high5.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/public/user")
	public List<UserDTO> getUsers() {
		return userService.getUsers();
	}

	@RequestMapping("/public/user/{userId}")
	public UserDTO getUser(@PathVariable final int userId) {
		return userService.getUser(userId);
	}
}
