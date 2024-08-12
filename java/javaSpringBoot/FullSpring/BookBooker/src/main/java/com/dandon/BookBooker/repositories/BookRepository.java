package com.dandon.BookBooker.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dandon.BookBooker.models.Book;
import com.dandon.BookBooker.models.User;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByBorrowerIsNull();
    List<Book> findByBorrower(User user);
}