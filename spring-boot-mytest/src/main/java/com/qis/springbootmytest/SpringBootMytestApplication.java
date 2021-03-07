package com.qis.springbootmytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMytestApplication {

	public static void main(String[] args) {
		System.out.println(SpringApplication.class.getClassLoader().getResource("META-INF/spring.factories"));

		SpringApplication.run(SpringBootMytestApplication.class, args);
	}

}
