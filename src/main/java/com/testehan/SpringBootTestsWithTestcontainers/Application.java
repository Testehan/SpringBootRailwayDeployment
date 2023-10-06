package com.testehan.SpringBootTestsWithTestcontainers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Profile({"dev"})
	@Bean
	CommandLineRunner runDevMode() {
		return args -> {
			System.out.println("Current profile is dev");
		};
	}

	@Profile({"prod"})
	@Bean
	CommandLineRunner runProductionMode() {
		return args -> {
			System.out.println("Current profile is production");
		};
	}

}
