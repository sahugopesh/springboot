package com.spring.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.spring.demo.springboot.repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
}
