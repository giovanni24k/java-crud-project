package com.giovanni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanni.entity.User;
import com.giovanni.repositories.UserRepository;

@Service
public abstract class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public Iterable<User> listAllUsers() {
		return userRepository.findAll();
	}
	
	
	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}
	
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	
	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	
	
}
