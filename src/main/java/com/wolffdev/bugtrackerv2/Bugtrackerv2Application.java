package com.wolffdev.bugtrackerv2;


import com.wolffdev.bugtrackerv2.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Bugtrackerv2Application {
	@Autowired
	private BugRepository repository;
	@Autowired
	private DeveloperRepository drepository;
	@Autowired
	private UserRepository urepository;


	public static void main(String[] args) {
		SpringApplication.run(Bugtrackerv2Application.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			Developer developer1 = new Developer("Tuukka", "Hartikainen");
			Developer developer2 = new Developer("Perttu", "Matikainen");
			drepository.save(developer1);
			drepository.save(developer2);


			repository.save(new Bug("UI ois jees", "Vastaanotettu", 1,3, developer1));
			repository.save(new Bug("Tunnistautuminen tarvitaan", "Vastaanotettu", 1,3, developer2));
			repository.save(new Bug("bugiin liitetyn devaajan tietojen haussa ongelmisa restapin kautta", "Vastaanotettu", 3,5, developer2));

			// username: user password: tuukka
			urepository.save(new User("user",
					"$2a$10$E0zTmZZT2omhBgv2tLRjcu.azKZunxq6h4JW3yrXFaiRzkTfwKDQC",
					"USER"));
			// username: admin password: admin
			urepository.save(new User("admin",
					"$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG",
					"ADMIN"));
		};

	}

}
