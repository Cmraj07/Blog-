package com.demo_blog.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo_blog.entities.User;
import com.demo_blog.payloads.UserDto;
import com.demo_blog.repositories.UserRepo;
import com.demo_blog.services.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	public UserDto createUser(UserDto userDto) {
		User user = this.dtoToUser(userDto);
		User savedUser = this.userRepo.save(user);
		
		return this.userToDto(savedUser);
		
	}

	private UserDto userToDto(User savedUser) {
		// TODO Auto-generated method stub
		return null;
	}

	private User dtoToUser(UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		
	}
	

}
