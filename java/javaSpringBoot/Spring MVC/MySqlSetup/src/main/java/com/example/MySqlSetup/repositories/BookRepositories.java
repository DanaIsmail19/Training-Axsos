package com.example.MySqlSetup.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.MySqlSetup.models.book;

@Repository
public interface BookRepositories extends CrudRepository<book, Long> {
    List<book> findAll();
    List<book> findByDescriptionContaining(String search);
    Long countByTitleContaining(String search);
    Long deleteByTitleStartingWith(String search);
}