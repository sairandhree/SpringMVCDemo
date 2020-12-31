package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Author;

public interface AuthorRepo  extends JpaRepository<Author, Long>{

}
