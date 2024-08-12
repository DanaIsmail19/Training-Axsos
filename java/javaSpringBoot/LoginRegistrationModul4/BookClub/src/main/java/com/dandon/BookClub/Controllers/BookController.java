package com.dandon.BookClub.Controllers;

import com.dandon.BookClub.models.Book;
import com.dandon.BookClub.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // List all books
    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.findAllBooks());
        return "books/list";
    }

    // Show add book form
    @GetMapping("/new")
    public String showAddBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "books/new";
    }

    // Save a new book
    @PostMapping
    public String addBook(@ModelAttribute Book book, RedirectAttributes redirectAttributes) {
        bookService.saveBook(book);
        redirectAttributes.addFlashAttribute("successMessage", "Book added successfully!");
        return "redirect:/books";
    }

    // Edit book details
    @GetMapping("/{id}/edit")
    public String editBook(@PathVariable Long id, Model model) {
        Book book = bookService.findBookById(id);
        model.addAttribute("book", book);
        return "books/edit";
    }

    // Update book details
    @PostMapping("/{id}/edit")
    public String updateBook(@PathVariable Long id, @ModelAttribute Book book, RedirectAttributes redirectAttributes) {
        bookService.updateBook(id, book);
        redirectAttributes.addFlashAttribute("successMessage", "Book updated successfully!");
        return "redirect:/books";
    }

    // Delete a book
    @GetMapping("/{id}/delete")
    public String deleteBook(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        bookService.deleteBook(id);
        redirectAttributes.addFlashAttribute("successMessage", "Book deleted successfully!");
        return "redirect:/books";
    }
}