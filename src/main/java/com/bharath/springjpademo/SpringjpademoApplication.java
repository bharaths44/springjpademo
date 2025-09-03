package com.bharath.springjpademo;

import com.bharath.springjpademo.models.Video;
import com.bharath.springjpademo.repositories.AuthorRepository;
import com.bharath.springjpademo.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringjpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpademoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(AuthorRepository repository,
//											   VideoRepository videoRepository) {
//		return args -> {
////			var author = Author.builder()
////							   .firstName("Bharath")
////							   .lastName("S")
////							   .age(21)
////							   .email("bharathsatheesan@gmail.com")
////							   .build();
////			repository.save(author);
//			var video = Video.builder().name("abc").length(5).build();
//			videoRepository.save(video);
//		};
//	}

}
