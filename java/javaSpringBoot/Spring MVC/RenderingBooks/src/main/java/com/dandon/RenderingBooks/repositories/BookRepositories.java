package com.dandon.RenderingBooks.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dandon.RenderingBooks.models.Book;

@Repository
public interface BookRepositories extends CrudRepository<Book, Long> {
    List<Book> findAll();
    List<Book> findByDescriptionContaining(String search);
    Long countByTitleContaining(String search);
    Long deleteByTitleStartingWith(String search);
}