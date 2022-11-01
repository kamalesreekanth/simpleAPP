package com.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleAppApplication {
	
	@GetMapping("/home")
	public String welcome() {
		return "welcome to my channel you and your family";
	}

	@GetMapping("/home1")
	public String welcome1() {
		return "welcome to my channel you and your family";
	}
	
	@GetMapping("/home2")
	public String welcome3() {
		return "welcome to my channel you and your family";
	}
	public static void main(String[] args) {
		SpringApplication.run(SimpleAppApplication.class, args);
	}

}
