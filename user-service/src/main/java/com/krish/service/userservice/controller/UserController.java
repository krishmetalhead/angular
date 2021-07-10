package com.krish.service.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krish.service.userservice.model.UserBean;
import com.krish.service.userservice.service.UserService;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/user/{userName}")
	UserBean getUser(@PathVariable String userName)
	{
		System.out.println("Insider Controller");
		return service.getUser(userName);
	}

}
