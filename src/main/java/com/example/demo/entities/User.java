package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String password;
	
	private String email;
	
	@Column(name="phone")
	
	private Long phoneNumber;
	
	private String city;
	
	// createdby, createdat, modified

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public Integer getPhoneNumber() {
//		return phoneNumber;
//	}
//
//	public void setPhoneNumber(Integer phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//
//	public User( String name, String email, Integer phoneNumber) {
//		
//	
//		this.name = name;
//		this.email = email;
//		this.phoneNumber = phoneNumber;
//	}
//
//	public User() {
//		
//	}
	
	
}
