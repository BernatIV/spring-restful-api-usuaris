package com.usuaris.springrestfulapiusuaris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringRestfulApiUsuarisApplication {

	/**
	 * Genera una nova instància de BCryptPasswordEncoder per a la classe UserController.
	 */
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRestfulApiUsuarisApplication.class, args);
	}
}

/*
FONTS:
https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/

 */