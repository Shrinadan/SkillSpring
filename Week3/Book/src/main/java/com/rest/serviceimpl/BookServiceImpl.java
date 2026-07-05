package com.rest.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Book;
import com.rest.repo.BookRepo;
import com.rest.service.BookService;


import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book save(Book book) {
        // Save and return the persisted entity
        return bookRepo.save(book);
    }

    @Override
    public Book get(Integer id) {
        // Using findById() which returns Optional<Book>
        Optional<Book> optionalBook = bookRepo.findById(id);
        // You may throw an exception if not found, or return null (not recommended)
        return optionalBook.orElse(null);
    }

    @Override
    public Book update(Book book, Integer id) {
        // Check if the entity exists
        Optional<Book> optionalExisting = bookRepo.findById(id);
        if (optionalExisting.isPresent()) {
            Book existing = optionalExisting.get();
            // Update fields you want to change (example: all fields)
           
            existing.setAuthor(book.getAuthor());
            existing.setPrice(book.getPrice());
            // ... update other fields as needed
            return bookRepo.save(existing);
        } else {
            // Handle not found – you could throw a custom exception
            throw new RuntimeException("Book with id " + id + " not found");
        }
    }

    @Override
    public void delete(Integer id) {
        bookRepo.deleteById(id);
    }

	

	}
