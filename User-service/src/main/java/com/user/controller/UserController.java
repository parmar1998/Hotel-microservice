package com.user.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
//		generate unique id
		
		User user1 = service.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
		User user = service.getUser(userId);
		return ResponseEntity.ok(user);
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUser() {
		List<User> allUser = service.getAllUser();
		return ResponseEntity.ok(allUser);
	}
}
