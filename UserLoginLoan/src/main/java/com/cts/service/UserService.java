package com.cts.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bean.User;
import com.cts.controller.UserController;
import com.cts.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	Logger logger = LoggerFactory.getLogger(UserService.class);



	public User find(String userName) {
		return repo.findByUsername(userName);
	}

}