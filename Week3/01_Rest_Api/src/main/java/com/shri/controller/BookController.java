package com.shri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;


import com.shri.entity.Book;

@RestController
public class BookController {

	@PostMapping( value="/books", consumes= {"application/xml","application/json"},
	produces = "text/plain"
			)
	 public String addBook(@RequestBody Book b)
	 {
		 return "added book";
	 }
	// here object are convert to java
	// using internal jackson api
	
	@GetMapping(value = "/book",produces = {"application/xml", "application/json"})
	// based on consumer need data xml or json format
	public Book get()
	{
		Book book=new Book();
		book.setId(101);
		book.setName("physics");
		book.setPrice(808);
		return book;
	}

}
