package com.example.eCommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/login")
	public String loginUser(@RequestParam String username, @RequestParam String password) {
		// Simple validation logic (Replace with database verification in real applications)
		if ("admin".equals(username) && "password".equals(password)) {
			return "Login successful!";
		} else {
			return "Invalid username or password.";
		}
	}
}
