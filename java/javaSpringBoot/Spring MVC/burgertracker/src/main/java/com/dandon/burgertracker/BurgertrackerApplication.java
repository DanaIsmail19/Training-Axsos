package com.dandon.burgertracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BurgertrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BurgertrackerApplication.class, args);
	}

}
