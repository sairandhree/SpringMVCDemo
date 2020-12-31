package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.responsebeans.UserDTO;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	
	public List<UserDTO> getUsers(){
		
		// filter users based on some criteria'
		// or add property to users
		List<User> users = userRepo.findAll();
		
		List<UserDTO> userDtos = new ArrayList();
		
		ModelMapper modelMapper = new ModelMapper();
		users.forEach(user->{
			
			UserDTO userDTO = modelMapper.map(user, UserDTO.class);
			userDtos.add(userDTO);
		});
		
		return userDtos;
	}


	public void createUser(User newUser) {
		
		//validations like if userwith this email is already present.
		
		userRepo.save(newUser);
		
	}


	public void deleteUser(Long id) {
		
		// check authority
		userRepo.deleteById(id);
		
	}


	public void updateUser(Long id, User userToUpdate) {
	
		userRepo.save(userToUpdate);
		
	}
	
}
