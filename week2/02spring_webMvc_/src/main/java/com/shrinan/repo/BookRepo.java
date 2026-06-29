package com.shrinan.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.shrinan.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
