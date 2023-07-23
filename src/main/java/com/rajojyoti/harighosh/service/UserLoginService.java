package com.rajojyoti.harighosh.service;

import org.springframework.stereotype.Service;

import com.rajojyoti.harighosh.dto.UserCreateDTO;
import com.rajojyoti.harighosh.dto.UserDTO;
import com.rajojyoti.harighosh.entities.UserEntity;


public interface UserLoginService {

	UserCreateDTO createUser(UserDTO user);
	
	

}
