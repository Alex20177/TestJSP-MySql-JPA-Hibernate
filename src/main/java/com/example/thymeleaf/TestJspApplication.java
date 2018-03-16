package com.example.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
@EntityScan("com.example.entities")
public class TestJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJspApplication.class, args);
	}
}
