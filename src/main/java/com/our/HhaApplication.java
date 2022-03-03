package com.our;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HhaApplication.class, args);
	}

}
