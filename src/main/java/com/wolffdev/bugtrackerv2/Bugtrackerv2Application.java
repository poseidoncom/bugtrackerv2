package com.wolffdev.bugtrackerv2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.wolffdev.bugtrackerv2.domain.Bug;
import com.wolffdev.bugtrackerv2.domain.BugRepository;
import com.wolffdev.bugtrackerv2.domain.Developer;
import com.wolffdev.bugtrackerv2.domain.DeveloperRepository;



@SpringBootApplication
public class Bugtrackerv2Application {
	@Autowired
	private BugRepository repository;
	@Autowired
	private DeveloperRepository derepository;


	public static void main(String[] args) {
		SpringApplication.run(Bugtrackerv2Application.class, args);
	}
	@Bean

	CommandLineRunner runner(){
		return args -> {
			Developer developer1 = new Developer("Tuukka", "Hartikainen");
			derepository.save(developer1);


			repository.save(new Bug("UI ois jees", "Vastaanotettu", 1,3, developer1));
			repository.save(new Bug("Tunnistautuminen tarvitaan", "Vastaanotettu", 1,3, developer1));

		};
	}

}
