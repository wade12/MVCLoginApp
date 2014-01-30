package com.wade12.service;

import java.util.HashMap;

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
	
	
	public String getUsername(String userId) {
		return users.get(userId);
	} // end method getUsername

} // end Class LoginService
