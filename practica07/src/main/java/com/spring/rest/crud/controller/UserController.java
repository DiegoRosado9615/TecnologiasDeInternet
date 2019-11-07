package com.spring.rest.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.crud.dto.UserResponse;
import com.spring.rest.crud.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	
	@GetMapping("/v1/accounts/{id}/record")
	public UserResponse getUser(@PathVariable int id) {
		return service.getUser(id);
	}

}
