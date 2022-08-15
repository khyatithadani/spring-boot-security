package com.example.SpringBootSecurityThymeleaf.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBootSecurityThymeleafDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityThymeleafDemoApplication.class, args);
	}

	// @Bean
	// BCryptPasswordEncoder bCryptPasswordEncoder() {
	// 	return new BCryptPasswordEncoder();
	// }
}
