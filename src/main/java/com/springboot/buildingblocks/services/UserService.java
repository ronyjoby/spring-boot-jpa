package com.springboot.buildingblocks.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.buildingblocks.entities.User;
import com.springboot.buildingblocks.exceptions.UserNotFoundException;
import com.springboot.buildingblocks.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Optional<User> getUserById(Long id){
		return userRepository.findById(id);
	}
	
	public User createUser(User user){
		return userRepository.save(user);
	}
	
	public User updateUser(Long id,User user) throws UserNotFoundException{
		
		Optional<User> optionalUser = userRepository.findById(id);
		
		if(!optionalUser.isPresent()){
			throw new UserNotFoundException("User : " + id + " not found in repo");
		}
		
		user.setId(id);
		return userRepository.save(user);
	}
	
	public void deleteUser(Long id){
		
		userRepository.deleteById(id);
		return;
	}
}
