package com.romsreu.sandbox;

import com.romsreu.sandbox.entities.User;
import com.romsreu.sandbox.entities.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SandboxApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserRepository repo) {
		return args -> {
			repo.save(
					User.builder()
							.nombre("Roman")
							.email("roman@mail.com")
							.build()
			);
		};
	}
}