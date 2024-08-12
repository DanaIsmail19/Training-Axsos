package com.dandon.LoginRegistration.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dandon.LoginRegistration.models.User;

@Repository
public interface UserRepossitory extends CrudRepository<User, Long> {
 
	Optional<User> findByEmail(String email);
 
}