package com.rest.controller;

import java.util.concurrent.Flow.Publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Book;
import com.rest.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	// for save the data
	@PostMapping("/save")
	public Book save(@RequestBody Book book)
	{
		return bookService.save(book);
		
	}
	// for the read/get the data
	@GetMapping("/get/{id}")
	public Book get(@PathVariable Integer id)
	{
		return bookService.get(id);
	}
	
	// for update
	@PutMapping("update/{id}")
	public Book update(@RequestBody Book book, @PathVariable  Integer id)
	{
		return bookService.update(book, id);
		
	} 
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Integer id)
	{
		bookService.delete(id);
		return "delete succesfuuly";
	}
	 

}
