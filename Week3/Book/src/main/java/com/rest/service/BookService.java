package com.rest.service;

import com.rest.entity.Book;

public interface BookService {

	//for create
	Book save(Book book);
	  
	// for get/Read
	
	Book get(Integer id);
	
	// for update
	Book update(Book book,Integer id);
	  
	
	//for delete
	void delete(Integer id);
	
	
	
	
}
