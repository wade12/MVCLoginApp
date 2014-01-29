package com.wade12.service;

public class LoginService {
	
	// dummy method
	public boolean authenticate(String userId, String password){
		
		if ( (password == null) || (password.trim() == "") ) {
			return false;
		} // end if
		else
			return true;
		
	} // end method authenticate

} // end Class LoginService
