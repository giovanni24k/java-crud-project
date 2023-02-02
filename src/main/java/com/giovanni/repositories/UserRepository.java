package com.giovanni.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanni.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByName(String name);
	public User findByPassword(String password);
		
	
}
