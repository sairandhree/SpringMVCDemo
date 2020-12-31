package com.example.demo.responsebeans;

import javax.persistence.Column;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
@NoArgsConstructor

public class UserDTO {
	
	

	private String name;
	
	private String email;
	
	private Long phoneNumber;
	
	private String city;
}
