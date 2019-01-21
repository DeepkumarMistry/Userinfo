package com.userInfoInterview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userInfoInterview.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	User findByLastName(String LastName);
}
