package com.bharath.springjpademo;

import com.bharath.springjpademo.models.Author;
import com.bharath.springjpademo.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringjpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository) {
		return args -> {
			var author = Author.builder()
							   .firstName("Bharath")
							   .lastName("S")
							   .age(21)
							   .email("bharathsatheesan@gmail.com")
							   .createdAt(LocalDateTime.now())
							   .build();
			repository.save(author);
		};
	}

}
