package com.dandon.BookClub.repositories;

import com.dandon.BookClub.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Example: Fetch all books by a specific user
    List<Book> findByUserId(Long userId);
}