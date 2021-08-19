package com.s1dmlgus.JpaBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JpaBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaBookApplication.class, args);
	}

}
