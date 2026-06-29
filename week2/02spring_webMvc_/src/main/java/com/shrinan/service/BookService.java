package com.shrinan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shrinan.entity.Book;
import com.shrinan.repo.BookRepo;

@Service
public class BookService {
	private BookRepo bookRepo;
	
	
	public BookService(BookRepo bookRepo)
	{
		this.bookRepo=bookRepo;
		
	}
	public Book save(Book book)
	{
		return bookRepo.save(book);
		
	}
	public Book getById(Integer id) {
	    return bookRepo.findById(id).orElse(null);
	}

	
	public Book update(Book book)
	{
		return bookRepo.save(book);
	}
	public List<Book> getAll()
	{
		return bookRepo.findAll();
	}
	public void deleteById(Integer id)
	{
		bookRepo.deleteById(id);
	}

}
