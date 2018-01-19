package com.statustracker.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com")
@EnableAutoConfiguration
public class StatusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatusTrackerApplication.class, args);
	}
}
