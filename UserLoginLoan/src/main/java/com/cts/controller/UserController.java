package com.cts.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bean.User;
import com.cts.service.UserService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
    @GetMapping(path="/basicauth")
	public Principal user(Principal principal) {
    	return principal;
	}
	



}
