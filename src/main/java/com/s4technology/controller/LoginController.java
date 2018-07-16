package com.s4technology.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.s4technology.model.JSONResultObject;
import com.s4technology.model.User;
import com.s4technology.services.UserInterface;

@RestController
public class LoginController {

	@Autowired
	UserInterface userService;

	@RequestMapping(path = "/user/login")
	public @ResponseBody JSONResultObject authenticateUser(@RequestBody User user) {

		userService.authenticateUser(user);
		JSONResultObject obj = new JSONResultObject();
		obj.setResult("true");
		return obj;
	}

}
