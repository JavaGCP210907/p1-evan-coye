package com.revature.services;

public class LoginService {
	
	public boolean login(String ers_username, String ers_password) {
		if(ers_username.equals("bill-smith") && ers_password.equals("password1")) {
			return true;
		}
		
		return false;
		
	}

}
