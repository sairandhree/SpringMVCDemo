package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.responsebeans.UserDTO;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public List<UserDTO> getUsers(){
		return userService.getUsers();
	}

	
	@PostMapping("/")
	public String createUser( @RequestBody User newUser) {
		
		userService.createUser(newUser);		
		
		return "user is created";
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Long id) {
		
		userService.deleteUser(id);		
		
		return "user is deleted";
	}
	
	@PatchMapping("/{id}")  //@putMapping
	public String updateUser(@PathVariable Long id, @RequestBody User userToUpdate) {
		
		userService.updateUser(id, userToUpdate);		
		
		return "user is deleted";
	}
	
}
