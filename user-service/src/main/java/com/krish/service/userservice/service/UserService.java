package com.krish.service.userservice.service;

import org.springframework.stereotype.Service;

import com.krish.service.userservice.model.UserBean;

@Service
public class UserService {

	public UserBean getUser(String userName) {
		System.out.println("Inside service : "+userName);
		UserBean user = null;
		if ("krish".equals(userName)) {
			user = new UserBean("Krishnendu", "46063648", "Kolkata");
		} else {
			user = new UserBean("Other", "0", "Kolkata");
		}
		return user;

	}

}
