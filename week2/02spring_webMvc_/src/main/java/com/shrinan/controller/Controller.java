package com.shrinan.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shrinan.entity.Book;
import com.shrinan.service.BookService;

@org.springframework.stereotype.Controller

public class Controller {

	private BookService bookService;
	public Controller(BookService bookService)
	{
		this.bookService=bookService;
		
	}
	@GetMapping("/index")
	public String hii()
	{
		return "index";
	}
	
	@PostMapping("/add")
	public String addBook(@ModelAttribute Book book) {
	    bookService.save(book);
	   return "redirect:/getAll";

	}
	// page load for add
	@GetMapping("/add")
	public String showAddBookPage() {
	    return "add_book";  
	}
	@GetMapping("/delete")
	public String deleteBook(@RequestParam("bookid") Integer id) {
	    bookService.deleteById(id);
	    return "redirect:/getAll";
	}



	

	
	@GetMapping("/getAll")
public String showBooks(Model model)
{
		List<Book> books=bookService.getAll();
		model.addAttribute("books",books);
		return "books";
}
	
	
	
	

	@PostMapping("/update")
	public String updateBook(@ModelAttribute Book book,
	                         RedirectAttributes ra) {

	    bookService.save(book);   // save() = update if ID exists
	    ra.addFlashAttribute("msg", "Book updated successfully!");

	    return "redirect:/getAll";
	}



	

	
	@GetMapping("/edit/{id}")
	public String editBook(@PathVariable Integer id, Model model) {

	    Book book = bookService.getById(id);

	    if (book == null) {
	        return "redirect:/getAll";
	    }

	    model.addAttribute("book", book);
	    return "edit-book";
	}

	
}
