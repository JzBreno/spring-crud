package com.jzbreno;

import com.jzbreno.model.Course;
import com.jzbreno.model.UserApp;
import com.jzbreno.repository.CourseRepository;
import com.jzbreno.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository, UserRepository userRepository) {
		return args -> {
			courseRepository.deleteAll();
			userRepository.deleteAll();
			UserApp u = new UserApp();
			Course c = new Course();
			c.setNome("Angular com Spring");
			c.setCategoria("FullStack");
			u.setNome("Jose Breno");
			u.setEmail("Jose Breno Sousa Jacauna");
			userRepository.save(u);
			courseRepository.save(c);


			System.out.println("cardique, ahn");

		};
	}

}
