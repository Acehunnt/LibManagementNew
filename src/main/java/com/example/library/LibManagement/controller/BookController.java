package com.example.library.LibManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.LibManagement.model.Book;
import com.example.library.LibManagement.service.BookrService;

@RestController
@RequestMapping("/api/books")
public class BookController {
	@Autowired
	private BookrService bookservice;
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookservice.getAllBooks();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") long id){
		return ResponseEntity.ok(bookservice.getBookById(id));		
	}
	
	@PostMapping
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		return ResponseEntity.ok(bookservice.addBook(book));
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable("id") long id, @RequestBody Book bookdetails){
		return ResponseEntity.ok(bookservice.updateBook(id, bookdetails));
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable("id") Long id){
		bookservice.deleteBook(id);
		return ResponseEntity.noContent().build();
	}
	
	
}



















































