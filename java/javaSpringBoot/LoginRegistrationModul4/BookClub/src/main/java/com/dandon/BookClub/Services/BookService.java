package com.dandon.BookClub.Services;

import com.dandon.BookClub.models.Book;
import com.dandon.BookClub.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Find all books
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    // Save a new book
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // Find a book by id
    public Book findBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null);
    }

    // Update a book
    public Book updateBook(Long id, Book updatedBook) {
        return bookRepository.findById(id)
            .map(book -> {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                book.setThoughts(updatedBook.getThoughts());
                return bookRepository.save(book);
            })
            .orElseGet(() -> {
                updatedBook.setId(id);
                return bookRepository.save(updatedBook);
            });
    }

    // Delete a book
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}