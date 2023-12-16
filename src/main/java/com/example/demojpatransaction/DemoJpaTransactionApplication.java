package com.example.demojpatransaction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcConnectionDetails;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoJpaTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaTransactionApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(JdbcConnectionDetails jdbc) {
		return args -> {
			System.out.println(jdbc.getDriverClassName());
			System.out.println(jdbc.getUsername());
			System.out.println(jdbc.getPassword());
			System.out.println(jdbc.getJdbcUrl());
		};
	}

}
