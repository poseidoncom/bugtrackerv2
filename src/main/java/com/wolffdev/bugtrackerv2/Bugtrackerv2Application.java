package com.wolffdev.bugtrackerv2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class Bugtrackerv2Application {
	private static final Logger logger = LoggerFactory.getLogger(Bugtrackerv2Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Bugtrackerv2Application.class, args);
		logger.info("Hello Spring Boot");

		@Bean

		CommandLineRunner runner(){
			return args -> {
				repository.save(new Bug(1,'jaa', 'Vastaanotettu', 1,3));
			};
		}
	}

}
