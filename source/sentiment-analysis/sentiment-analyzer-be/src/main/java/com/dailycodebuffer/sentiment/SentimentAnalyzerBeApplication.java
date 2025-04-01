package com.dailycodebuffer.sentiment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SentimentAnalyzerBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentimentAnalyzerBeApplication.class, args);
	}

}
