package com.example.cliento;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClientoApplication {

	@Value("${user.role}")
	String role;

	public static void main(String[] args) {
		SpringApplication.run(ClientoApplication.class, args);
	}

	@GetMapping("")
	public String hello() {
		return "hello %s".formatted(role);
	}

}
