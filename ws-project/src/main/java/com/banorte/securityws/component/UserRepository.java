package com.banorte.securityws.component;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
	
	private User user;
	
	@PostConstruct
	public void initData(){
		user = new User();
		user.setUserName("user");
		user.setPassword("12345678");
	}
	
	public User getUser(String userName, String pwd){
		return user;
	}
	
	
}
