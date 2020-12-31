package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Book;

public interface BookRepo extends JpaRepository<Book, Long> {
	
	//select * frm books where title = '?'
	public List<Book> findByTitleIgnoreCase(String title);
	
	public List<Book> findByTitleStartingWithIgnoreCase(String title);
	
	public List<Book> findByPriceLessThan(Double price);
	
	
	// select * from books , authors where books.author_id = author.id and author.name ='name%'
	public List<Book> findByAuthorNameStartingWithIgnoreCase(String author);

}
