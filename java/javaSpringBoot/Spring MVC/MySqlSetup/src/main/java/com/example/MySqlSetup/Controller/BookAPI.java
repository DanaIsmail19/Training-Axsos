package com.example.MySqlSetup.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.MySqlSetup.services.BookService;
@RestController
public class BookAPI {
 private final BookService bookService;
 public BookAPI(BookService bookService){
     this.bookService = bookService;
 }

 @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
 public void destroy(@PathVariable("id") Long id) {
     bookService.deleteBook(id);
 }
}