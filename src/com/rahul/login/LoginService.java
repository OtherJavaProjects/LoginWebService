package com.rahul.login;

import java.util.HashMap;

public class LoginService {

	HashMap<String, String> userNameMap;
	
	public LoginService(){
		userNameMap = new HashMap<String,String>();
		userNameMap.put("Sahukar", "Rahul Sahukar");
		userNameMap.put("Dravid", "Rahul Dravid");
		userNameMap.put("Roy", "Rahul Roy");
	}
	
	public boolean authenticate(String userId, String password){
		if(password == null || password.trim()==""){
			return false;
		}
		return true;
	}
	
	public User getUserDetails(String userId){
		User user = new User();
		user.setId(userId);
		user.setName(userNameMap.get(userId));
		
		return user;
	}
}
