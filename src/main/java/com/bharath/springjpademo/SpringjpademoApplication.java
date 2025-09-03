package com.bharath.springjpademo;

import com.bharath.springjpademo.models.Author;
import com.bharath.springjpademo.repositories.AuthorRepository;
import com.bharath.springjpademo.repositories.VideoRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringjpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository,
											   VideoRepository videoRepository) {
		return args -> {
			for (int i = 0; i < 50; i++) {
				Faker faker = new Faker();
				var author = Author.builder()
								   .firstName(faker.name().firstName())
								   .lastName(faker.name().lastName())
								   .age(faker.number().numberBetween(19, 50))
								   .email(faker.internet().emailAddress())
								   .build();
				repository.save(author);
			}
			//saving a single author
			var author = Author.builder()
							   .Id(1)
							   .firstName("Bharath")
							   .lastName("S")
							   .age(21)
							   .email("bharathsatheesan@gmail.com")
							   .build();
			repository.save(author);

			// update Author a set a.age=22 where a.id=1
			repository.updateAuthor(22,1);

			repository.findByNamedQuery(22);
		};
	}


}
