/**
 * 
 */
package com.rajojyoti.harighosh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajojyoti.harighosh.entities.User;
import com.rajojyoti.harighosh.service.UserLoginService;

/**
 * @author rajojyoti$
 *
 */
@RestController
@RequestMapping(value = "/api")
public class LoginController {
	
	@Autowired
	UserLoginService userLoginService;
	
	
	@PostMapping(value = "/login")
	public ResponseEntity<User> login(@RequestBody User user){
		
		return new ResponseEntity<>(userLoginService.createUser(user), HttpStatus.OK);
		
	}
	

}
