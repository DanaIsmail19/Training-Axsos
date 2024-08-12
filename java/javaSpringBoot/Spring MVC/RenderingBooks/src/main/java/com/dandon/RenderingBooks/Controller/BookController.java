package com.dandon.RenderingBooks.Controller;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;

	import com.dandon.RenderingBooks.repositories.BookRepositories;

	@Controller
	public class BookController {

	    @Autowired
	    private BookRepositories bookRepository;

	    @GetMapping("/books/{id}")
	    public String showBook(@PathVariable("id") Long id, Model model) {
	        com.dandon.RenderingBooks.models.Book book = bookRepository.findById(id).orElse(null);
	        model.addAttribute("book", book);
	        return "show.jsp";
	    }
	}
