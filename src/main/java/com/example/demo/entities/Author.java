package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="authors")


@Getter
@Setter
@NoArgsConstructor
public class Author {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	
	@OneToMany (mappedBy = "author")
	@JsonBackReference
	private List<Book> books;
	

}
