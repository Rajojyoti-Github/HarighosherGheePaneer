package com.rajojyoti.harighosh.service;

import org.springframework.stereotype.Service;

import com.rajojyoti.harighosh.entities.User;

@Service
public interface UserLoginService {

	User createUser(User user);
	
	

}
