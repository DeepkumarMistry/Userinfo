package com.userInfoInterview.service;

import java.util.List;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userInfoInterview.model.User;
import com.userInfoInterview.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userrepository;
	
	@Autowired 
	public UserService(UserRepository userrepository) {
		this.userrepository = userrepository;
	}
	
	public User save(User user) {
		if(user.getId()!=null && userrepository.exists(user.getId())) {
			throw new EntityExistsException("There is already existing Entity with such ID in the database");
		}
		return userrepository.save(user);
	}
	
	public User update(User user) {
		if(user.getId()!=null && userrepository.exists(user.getId())) {
			throw new EntityExistsException("There is already existing Entity with such ID in the database");
		}
		return userrepository.save(user);
	}
	
	public List<User> findAll(){
		return userrepository.findAll();
	}
	
	public User findOne(Integer id) {
		return userrepository.findOne(id);
	}
	
	public void delete(Integer id) {
		userrepository.delete(id);
	}
}
