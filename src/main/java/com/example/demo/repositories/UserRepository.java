package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.User;
import com.example.demo.responsebeans.UserDTO;


public interface  UserRepository extends JpaRepository<User, Long>{
	
	public List<User> findAll();

}
