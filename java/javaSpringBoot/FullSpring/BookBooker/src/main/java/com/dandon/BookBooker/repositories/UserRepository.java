package com.dandon.BookBooker.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dandon.BookBooker.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
//	Optional<User> findByEmail(String email);
	 User findByEmail(String email);
}