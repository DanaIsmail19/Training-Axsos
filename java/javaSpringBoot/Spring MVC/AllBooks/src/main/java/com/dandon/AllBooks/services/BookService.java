package com.dandon.AllBooks.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dandon.AllBooks.models.BooksModel;
import com.dandon.AllBooks.repositories.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public List<BooksModel> allBooks() {
        return bookRepository.findAll();
    }

    public BooksModel createBook(BooksModel b) {
        return bookRepository.save(b);
    }

    public BooksModel findBook(Long id) {
        Optional<BooksModel> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
     public BooksModel updateBook(BooksModel book) {
		return bookRepository.save(book);
	}
	
    	public void deleteBook(Long id) {
		Optional<BooksModel> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			bookRepository.deleteById(id);
		}
	}

    
}