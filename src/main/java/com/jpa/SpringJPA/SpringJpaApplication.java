package com.jpa.SpringJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
//		new SpringApplicationBuilder(SpringJpaApplication.class)
//        .properties("spring.config.name:application")
//        .build()
//        .run(args);
	}

}
