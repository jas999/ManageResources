package com.s4technology.services;

import org.springframework.stereotype.Service;

import com.s4technology.model.User;



@Service
public class UserService  implements UserInterface{

	@Override
	public Boolean authenticateUser(User user) {
		
		
		return true;
	}

	
	
}
