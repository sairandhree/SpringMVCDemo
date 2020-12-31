package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	
	private Double price;
	
	private Integer numOfPages;
	
	@ManyToOne
	@JsonManagedReference
	private Author author;

}
