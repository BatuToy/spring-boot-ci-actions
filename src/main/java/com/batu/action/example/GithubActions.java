package com.batu.action.example;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.batu.action.example.repository")
@SpringBootApplication(scanBasePackages = "com.batu.action.example")
public class GithubActions {

	public static void main(String[] args) {
		SpringApplication.run(GithubActions.class, args);
	}

}
