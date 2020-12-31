package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Book;
import com.example.demo.repositories.BookRepo;

@RestController
@RequestMapping("books")
public class BooksController {

	@Autowired
	BookRepo bookRepo;
	
	
	@GetMapping("/")
	public List<Book> getBooks(){
		return bookRepo.findByAuthorNameStartingWithIgnoreCase("dan");
	}
	
	
	@GetMapping("/byname/{title}")
	public List<Book> getBooksbyTitle(@PathVariable String title){
		return bookRepo.findByTitleStartingWithIgnoreCase(title);
		
	}
	
	@GetMapping("/byprice/{lessthan}")
	public List<Book> getBooksbyTitle(@PathVariable Double lessthan){
		return bookRepo.findByPriceLessThan(lessthan);
		
	}
	
	//post
	
	//delete
	
	//patch
}
