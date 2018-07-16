package com.s4technology.controller;


import java.util.logging.Logger;

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

	static Logger perfLog = Logger.getLogger("LoginController");
	
	@Autowired
	UserInterface userService;

	
	@RequestMapping(path = "/user/login")
	public @ResponseBody JSONResultObject authenticateUser(@RequestBody User user) {
		perfLog.info("This is apache log");
		userService.authenticateUser(user);
		JSONResultObject obj = new JSONResultObject();
		obj.setResult("true");
		return obj;
	}

}
