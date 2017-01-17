package com.com.service;

import com.com.model.User;

public class AuthenticationService {
	
	public boolean authenticateLogin(User user){
		if(user.getUsername().equals("admin") && user.getPassword().equals("admin")){
			return true;
		}else{
			return false;
		}
	}

}
