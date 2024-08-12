package com.example.MySqlSetup.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.MySqlSetup.models.book;
import com.example.MySqlSetup.services.BookService;

import org.springframework.ui.Model;

@Controller
public class BooksController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public String home(Model model) {
		return "redirect:/books";
	}
	
	@GetMapping("/books")
	public String index(Model model) {
		
		List<book> books = bookService.allBooks();
		
		model.addAttribute("books", books);

		return "index.jsp";
	}
	
	@GetMapping("/books/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		
		book book = bookService.findBook(id);
		
		model.addAttribute("book", book);

		return "show.jsp";
	}
}
