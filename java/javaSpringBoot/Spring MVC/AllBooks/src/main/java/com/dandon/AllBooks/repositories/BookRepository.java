package com.dandon.AllBooks.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dandon.AllBooks.models.BooksModel;

@Repository
public interface BookRepository extends CrudRepository<BooksModel, Long> {
    List<BooksModel> findAll();
    List<BooksModel> findByDescriptionContaining(String search);
    Long countByTitleContaining(String search);
    Long deleteByTitleStartingWith(String search);
}