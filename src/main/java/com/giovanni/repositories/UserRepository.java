package com.giovanni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanni.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
