package com.giovanni.service;

import org.springframework.stereotype.Service;

import com.giovanni.entity.User;

@Service
public interface UserService {

	Iterable<User> listAllUsers();
	
	User getUserById(Integer id);
	
	User saveUser(User user);
	
	void deleteUser(Integer id);

	User getUserById(Long id);

	void deleteUser(Long id);
}
