package com.zen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonStartApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8081 );
		SpringApplication.run(CommonStartApplication.class, args);
	}

}
