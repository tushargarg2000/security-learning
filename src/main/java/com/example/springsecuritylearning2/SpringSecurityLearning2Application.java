package com.example.springsecuritylearning2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityLearning2Application {

	public static void main(String[] args) {


		String password = "abc";

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

		System.out.println(passwordEncoder.encode(password));


		SpringApplication.run(SpringSecurityLearning2Application.class, args);
	}

}
