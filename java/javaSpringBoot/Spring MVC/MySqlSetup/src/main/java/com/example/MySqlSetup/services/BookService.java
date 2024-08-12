package com.example.MySqlSetup.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.MySqlSetup.models.book;
import com.example.MySqlSetup.repositories.BookRepositories;

@Service
public class BookService {
    private final BookRepositories bookRepository;
    
    public BookService(BookRepositories bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public List<book> allBooks() {
        return bookRepository.findAll();
    }

    public book createBook(book b) {
        return bookRepository.save(b);
    }

    public book findBook(Long id) {
        Optional<book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
     public book updateBook(book book) {
		return bookRepository.save(book);
	}
	
    	public void deleteBook(Long id) {
		Optional<book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			bookRepository.deleteById(id);
		}
	}

    
}