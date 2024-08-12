package com.dandon.RenderingBooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class RenderingBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenderingBooksApplication.class, args);
	}

}
