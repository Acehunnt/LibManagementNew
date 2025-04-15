package com.example.library.LibManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.LibManagement.model.Book;

public interface BookrRepository extends JpaRepository<Book, Long> {
	

}
