package com.batu.action.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.batu.action.example")
public class GithubActions {

	public static void main(String[] args) {
		SpringApplication.run(GithubActions.class, args);
	}

}
