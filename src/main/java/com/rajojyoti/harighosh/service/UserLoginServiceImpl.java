package com.rajojyoti.harighosh.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajojyoti.harighosh.dao.UserCreateDao;
import com.rajojyoti.harighosh.dto.UserCreateDTO;
import com.rajojyoti.harighosh.dto.UserDTO;
import com.rajojyoti.harighosh.entities.UserEntity;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	
	@Autowired
	UserCreateDao userCreateDao;

	@Override
	public UserCreateDTO createUser(UserDTO user) {
		if(user.getUsername()!= null) {
			UserEntity userName = userCreateDao.findByUserName(user.getUsername());
			if(userName == null) {
				UserEntity userEntity = new UserEntity();
				userEntity.setUsername(user.getUsername());
				userEntity.setName(user.getName());
				userEntity.setPhonenumber(user.getPhonenumber());
				userEntity.setPassword(user.getPassword());
				userEntity.setEmailaddress(user.getPassword());
				userEntity.setAddress(user.getAddress());
				userEntity.setBloodgroup(user.getBloodgroup());
				userCreateDao.save(userEntity);
				return mapUserToDto(user);
			}
		}
		System.out.println("User is alreay present");
		return null;
		
	}

	private UserCreateDTO mapUserToDto(UserDTO user) {
		
		UserEntity newUser = userCreateDao.findByUserName(user.getUsername());
		UserCreateDTO myNewUser = new UserCreateDTO();

		if(newUser.getUsername() != null) {
			if(newUser.getUserid() != null) {
				myNewUser.setUserId(newUser.getUserid().toString());
			}
			if(user.getUsername() != null) {
				myNewUser.setUsername(user.getUsername());
			}
			if(user.getPassword() != null) {
				myNewUser.setPassword(user.getPassword());
			}
			if(user.getPhonenumber() != null) {
				myNewUser.setPhonenumber(user.getPhonenumber());
			}
			if(user.getAddress() != null) {
				myNewUser.setAddress(user.getAddress());
			}
			if(user.getEmailaddress() != null) {
				myNewUser.setEmailaddress(user.getEmailaddress());
			}
			if(user.getName() != null) {
				myNewUser.setName(user.getName());
			}
			if(user.getBloodgroup() != null) {
				myNewUser.setBloodgroup(user.getBloodgroup());
			}
			myNewUser.setUpdatedby("System");
			myNewUser.setTimestamp(LocalDate.now().toString());
		}
		
		return myNewUser;
		
	}

}
