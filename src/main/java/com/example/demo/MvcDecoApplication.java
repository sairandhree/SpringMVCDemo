package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import com.example.demo.entities.User;
import com.example.demo.repositories.AuthorRepo;
import com.example.demo.repositories.BookRepo;
import com.example.demo.repositories.UserRepository;

@SpringBootApplication
public class MvcDecoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcDecoApplication.class, args);
	}

	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	AuthorRepo authorRepo;
	
	@Autowired
	BookRepo bookRepo;
	
	@PostConstruct
	public void startup() {
		
		createUsers();
		createDataForAuthor1();
		createDataForAuthor2();
		
	}
	private void createDataForAuthor1() {
		
		Author author1 = new Author();
		author1.setName("JK rowling");	
		authorRepo.save(author1);
		
		Book book1 = new Book();
		book1.setTitle("Harry potter1");
		book1.setNumOfPages(500);
		book1.setPrice(250.00);
		book1.setAuthor(author1);
		bookRepo.save(book1);
		
		
		Book book2 = new Book();
		book2.setTitle("Harry potter 2");
		book2.setNumOfPages(400);
		book2.setPrice(300.00);
		book2.setAuthor(author1);
		bookRepo.save(book2);
		
	}
	
private void createDataForAuthor2() {
		
		Author author1 = new Author();
		author1.setName("Dan Brown");	
		authorRepo.save(author1);
		
		
		Book book1 = new Book();
		book1.setTitle("Da vinci code");
		book1.setNumOfPages(250);
		book1.setPrice(450.00);
		book1.setAuthor(author1);
		bookRepo.save(book1);
		
		
		Book book2 = new Book();
		book2.setTitle("angels and demons");
		book2.setNumOfPages(500);
		book2.setPrice(300.00);
		book2.setAuthor(author1);
		bookRepo.save(book2);
		
	}
	
	
	

	private void createUsers() {
		User user1 = new User();
		user1.setCity("pune");
		user1.setEmail("sairandhree@gmail.com");
		user1.setName("sairandhree");
		user1.setPhoneNumber(53453453535L);
		
		userRepo.save(user1);
		
		User user2 = new User();
		user2.setCity("pune");
		user2.setEmail("sairandhree@gmail.com");
		
		user2.setPhoneNumber(53453453535L);
		
		userRepo.save(user2);
	}
}
