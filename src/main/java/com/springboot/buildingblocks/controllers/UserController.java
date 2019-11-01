package com.springboot.buildingblocks.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.buildingblocks.entities.User;
import com.springboot.buildingblocks.exceptions.UserNotFoundException;
import com.springboot.buildingblocks.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long id){
		return userService.getUserById(id);
	}
	
	@PostMapping
	public User createUser(@RequestBody User user){
		return userService.createUser(user);
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable("id") Long id, @RequestBody User user) throws UserNotFoundException{
		return userService.updateUser(id, user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long id){
		
		userService.deleteUser(id);
		return;
	}

	

}
