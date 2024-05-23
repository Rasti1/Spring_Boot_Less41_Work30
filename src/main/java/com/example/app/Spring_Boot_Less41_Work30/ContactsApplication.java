package com.example.app.Spring_Boot_Less41_Work30;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.logging.Logger;

@SpringBootApplication
public class ContactsApplication {

	private static final Logger LOGGER = Logger.getLogger(ContactsApplication.class.getName());

	public static void main(String[] args) {
		new SpringApplicationBuilder(ContactsApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);
		LOGGER.info("APP is running...");
	}
}

