package com.rajojyoti.harighosh.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rajojyoti.harighosh.dto.UserDTO;
import com.rajojyoti.harighosh.entities.UserEntity;

public interface UserCreateDao extends JpaRepository<UserEntity, Integer>{

	@Query(value = "Select * from harighosh.user u where u.username = :username", nativeQuery = true)
	UserEntity findByUserName(@Param("username") String username);

}
