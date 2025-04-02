package com.skynetix.library.events.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.skynetix.library") // ✅ Ensures all controllers are scanned
public class LibraryEventsProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(LibraryEventsProducerApplication.class, args);
	}
}
