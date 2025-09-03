package com.bharath.springjpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpademoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(AuthorRepository repository) {
//		return args -> {
//			var author = Author.builder()
//							   .firstName("Bharath")
//							   .lastName("S")
//							   .age(21)
//							   .email("bharathsatheesan@gmail.com")
//							   .build();
//			repository.save(author);
//		};
//	}

}
