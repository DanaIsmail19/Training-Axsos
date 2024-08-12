package com.dandon.BookClub.repositories;

import com.dandon.BookClub.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query to find user by email for authentication
    User findByEmail(String email);
}