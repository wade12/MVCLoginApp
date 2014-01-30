package com.wade12.service;

import java.util.HashMap;

import com.wade12.dto.User;

// dummy business service
// use a database in the real world!
public class LoginService {
	
	HashMap<String, String> users = new HashMap<String, String>();
	
	public LoginService() {
		users.put("Paddy", "Paddy Murphy");
		users.put("Sean", "Sean Kelly");
		users.put("Mary", "Mary Ryan");
	} // end 0-argument constructor
	
	
	public boolean authenticate(String userId, String password){
		
		if ( (password == null) || (password.trim() == "") ) {
			return false;
		} // end if
		else
			return true;
	} // end method authenticate
	
	// Model is the user object that is being passed
	public User getUserDetails(String userId) {
		
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserName(userId);
		return user;
	} // end method getUsername

} // end Class LoginService
