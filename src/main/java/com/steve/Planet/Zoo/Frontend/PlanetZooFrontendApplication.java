package com.steve.Planet.Zoo.Frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PlanetZooFrontendApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(PlanetZooFrontendApplication.class).run(args);
	}

}
