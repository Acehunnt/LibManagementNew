package com.example.library.LibManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.LibManagement.model.Book;
import com.example.library.LibManagement.repository.BookrRepository;

@Service
public class BookrService {
	
	@Autowired
	private BookrRepository bookrepo;
	
	public List<Book> getAllBooks(){
		return bookrepo.findAll();
	}
	
	public Book getBookById(Long id) {
		return bookrepo.findById(id).orElseThrow(()->new RuntimeException("Book not found"));
	}
	
	public Book addBook(Book book) {
		return bookrepo.save(book);
	}
	
	public Book updateBook(Long id, Book bookdetails) {
		Book book = getBookById(id);
		book.setTitle(bookdetails.getTitle());
		book.setAuthor(bookdetails.getAuthor());
		book.setIsbn(bookdetails.getIsbn());
		book.setPrice(bookdetails.getPrice());
		
		return bookrepo.save(book);
		
	}
	
	public void deleteBook(Long id) {
		bookrepo.deleteById(id);
	}
}























