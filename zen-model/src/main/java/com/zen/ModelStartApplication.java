package com.zen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModelStartApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8082 );
		SpringApplication.run(ModelStartApplication.class, args);
	}

}
